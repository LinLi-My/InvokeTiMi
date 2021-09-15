package com.ml.timi.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.ml.timi.config.template.LogType;
import com.ml.timi.config.template.Message;
import com.ml.timi.config.template.Module;
import com.ml.timi.config.template.Status;
import com.ml.timi.config.webservices.WebServiceCallConfig;
import com.ml.timi.config.webservices.WebServiceCallMethodConfig;
import com.ml.timi.model.entity.User;
import com.ml.timi.model.entity.UserTest;
import com.ml.timi.model.entity.VideoOrderTest;
import com.ml.timi.model.log.request.RequestTemplate;
import com.ml.timi.model.log.response.ResponseBody;
import com.ml.timi.model.log.response.ResponseTemplate;
import com.ml.timi.service.*;
import com.ml.timi.utils.CommonUtils;
import com.ml.timi.utils.ExpertionLin;
import com.ml.timi.utils.LocalDateTimeAdapter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.cxf.endpoint.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/interfaceCall")
public class InterfaceCallController {


    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    private User userSearchByStatus;
    @Resource
    private UserTestService userTestService;
    @Resource
    private VideoOrderTestService videoOrderTestService;
    @Resource
    private RequestTemplate requestTemplate;
    @Resource
    private ResponseTemplate responseTemplate;
    @Resource
    private UserService userService;
    @Resource
    private ResponseTemplateService responseTemplateService;
    @Resource
    private RequestTemplateService requestTemplateService;
    /** 动态调用接口方法 */
    private String methodName;
    /** 调用接口地址 */
    private String URL;
    /*** 创建客户端 */
    private Client client;
    /** 批次标识 */
    private String batchId;
    /** 请求接口数据 */
    private String requestData;
    /** 请求体数据 */
    private String requestBody;
    /** 请求体数量 */
    private int requestBodyCount;
    /** 加密的MD5 */
    private String MD5Encrypt;
    /** 响应数据 */
    private String responseData;
    /** 结束日志信息 */
    private String endLogInfo;
    /** 状态 */
    private String STATUS;
    /** 响应数据 */
    private Object[] responseDataBack;
    /** 格式化JSON */
    private Gson gson = new GsonBuilder()
            .setPrettyPrinting()                                                    //格式化输出的json
            .serializeNulls()                                                       //有NULL值是也进行解析
            .disableHtmlEscaping()                                                  //解析特殊符号
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())   //为某特定对象设置固定的序列或反序列方式，自定义Adapter需实现JsonSerializer或者JsonDeserializer接口序列化[LocalDateTime的解析]
            .registerTypeAdapter(JsonElement.class, new LocalDateTimeAdapter())     //反序列化LocalDateTime(String——>LocalDateTime)的解析
            .create();

    @RequestMapping("callTestWebServiceList")
    public String callTestWbeServiceList() throws Exception {
        URL = WebServiceCallConfig.TestWebService;
        client = WebServiceCallConfig.call(URL);
        methodName = WebServiceCallMethodConfig.registerList;
        batchId = UUID.randomUUID().toString();
        endLogInfo = batchId + "-" + Module.INPUT + "：数据已处理";
        userSearchByStatus.setStatus("N");
        /** 根据Status：状态查询数据 */
        List<User> requestBodyList = userService.searchByStatus(userSearchByStatus);
        requestBodyCount = requestBodyList.size();
        if (ObjectUtils.isEmpty(requestBodyList)) {
            LOGGER.info("XXX暂无数据");
            return "暂无数据";
        }

        /** 将请求体数据集合转换为  JSON */
        requestBody = gson.toJson(requestBodyList);
        /** 将请求体JSON数据转化为  List对象集合（中间表）  */
        List<UserTest> userTestList = gson.fromJson(requestBody, new TypeToken<List<UserTest>>() {
        }.getType());
        /** 遍历List对象集合 */
        for (UserTest userTest : userTestList) {
            /** 数据源表的 主键 设置为 业务主键 */
            userTest.setNaturalkey(String.valueOf(userTest.getId()));
            /** 插入主表数据到中间表 */
            userTestService.insert(userTest);

            List<VideoOrderTest> videoOrderTestList = userTest.getVideoOrderList();
            /** 过滤集合里主键为空的集合 */
            videoOrderTestList = videoOrderTestList.stream().filter(s -> Objects.nonNull(s.getOutTradeNo())).collect(Collectors.toList());
            if (ObjectUtils.isNotEmpty(videoOrderTestList)) {
                /** 插入子表数据到中间表 */
                videoOrderTestService.insertBatch(videoOrderTestList);
            }
        }

        /**
         * 组装请求数据
         */
        requestBody = gson.toJson(userTestList);
        requestTemplate = new RequestTemplate.RequestTemplateBuilder()
                .setBatchId(batchId)                            //批次标识
                .setModule(Module.INPUT)                        //模块
                .setRequestTime(LocalDateTime.now())
                .setElapsedTime("耗时")                          //耗时
                .setRequestBodyCount(requestBodyCount)          //请求体数量
                .setRequestStatus(Status.SUCCESS)               //请求状态
                .setRequestStatusMessage(Message.SUCCESS)       //请求状态信息
                .setRequestBody(requestBody)                    //请求体数据
                .build();
        /** 将组装的请求数据转换为  JSON */
        requestData = gson.toJson(requestTemplate);
        /** 将组装的请求体JSON数据  MD5加密 */
        MD5Encrypt = CommonUtils.MD5Encrypt(requestData);
        /** 将请求日志插入数据库 */
        requestTemplateService.insert(requestTemplate);
        /** 记录请求日志 */
        LOGGER.info(LogType.Insert_RequestTemplate_Log +requestTemplate.toString());


        try {
            /**
             * 调用请求接口
             */
            responseDataBack = client.invoke(methodName, requestData, MD5Encrypt);
        } catch (Exception e) {
            /**
             * 响应 Error 处理响应数据
             */
            String ExceptionMessage = Message.Response_ERROR + ExpertionLin.Infor(e);
            ResponseTemplate responseTemplateError = new ResponseTemplate.ResponseTemplateBuilder()
                    .setBatchId(batchId)
                    .setModule(Module.INPUT)
                    .setResponseTime(LocalDateTime.now())
                    .setResponseStatus(Status.ERROR)
                    .setResponseStatusMessage(ExceptionMessage)
                    .build();
            /** 根据 batchId 更新响应 Error 的数据 */
            responseTemplateService.update(responseTemplateError);
            /** 记录响应 Error 日志 */
            LOGGER.error(LogType.Insert_ResponseTemplate_Log +responseTemplateError.toString());

            throw e;
        }


        /**
         * 响应 Success 处理响应数据
         */
        responseData = responseDataBack[0].toString();
        /** 将响应数据转化为 实体对象 */
        responseTemplate = gson.fromJson(responseData, ResponseTemplate.class);
        //1、获取响应体，并更新响应体
        List<ResponseBody> responseBodyList = responseTemplate.getResponseBody();
        if (ObjectUtils.isNotEmpty(responseBodyList)) {

            String responseBodyListJson = gson.toJson(responseBodyList);
            Map<String, String> responseBodyMap = new HashMap<>();
            responseBodyMap.put("batchId", batchId);
            responseBodyMap.put("responseBody", responseBodyListJson);
            responseTemplateService.updateResponseBody(responseBodyMap);
            for (ResponseBody responseBody : responseBodyList) {
                //根据状态更新原数据状态
                userTestService.updateStatusByNaturalkey(responseBody);
                LOGGER.info(LogType.Update_ResponseBody_Log +responseBody.toString());
            }
        }
        /** 记录响应日志 */

        LOGGER.info(LogType.Update_ResponseTemplate_Log +responseTemplate.toString());
        /** 根据 batchId 更新响应 Sccess 的数据 */
        //2、更新整个响应
        responseTemplateService.update(responseTemplate);
        LOGGER.info(endLogInfo);
        return endLogInfo;

    }
}
