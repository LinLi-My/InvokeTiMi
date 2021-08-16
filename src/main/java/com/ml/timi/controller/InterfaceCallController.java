/**
 * ClassName:      InterfaceCallController
 * Description:    webservice接口调用
 * Date:           2021 2021/7/20 9:07
 * Author:         Lin
 * Copyright:      Lin
 */
package com.ml.timi.controller;

import com.ml.timi.config.template.Module;
import com.ml.timi.config.template.Status;
import com.ml.timi.config.webservices.WebServiceCallConfig;
import com.ml.timi.config.webservices.WebServiceCallMethodConfig;
import com.ml.timi.mapper.log.RequestTemplateMapper;
import com.ml.timi.mapper.UserMapper;
import com.ml.timi.model.entity.User;
import com.ml.timi.model.log.request.RequestTemplate;
import com.ml.timi.model.log.response.ResponseTemplate;
import com.ml.timi.model.log.response.ResponseTemplateBody;
import com.ml.timi.service.LogService;
import com.ml.timi.utils.CommonUtils;
import com.ml.timi.utils.ExpertionLin;
import com.ml.timi.utils.JSONUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/interfaceCall")
public class InterfaceCallController {

    @Resource
    LogService logService;
    @Resource
    RequestTemplateMapper logMapper;
    @Resource
    UserMapper userMapper;
    @Resource
    public User user;
    @Resource
    public RequestTemplate requestTemplate;
    @Resource
    SqlSessionFactory sqlSessionFactory;

    /** 调用接口地址 */
    public String URL;
    /*** 创建客户端 */
    public Client client;
    /** 动态方法 */
    public static String methodName = "";
    /** 请求接口数据 */
    public String requestData = "";
    /** 加密的MD5 */
    public String MD5Encrypt = "";
    /** 响应数据 */
    public String responseData;
    /** 批次标识 */
    public String batchId;
    /** 下传数量 */
    public int downloadCount;
    /** 下传状态 */
    public String downloadStatus = "Error";
    Object[] responseDataBack;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("callTestWebService")
    public String callTestWebService() {

        URL = WebServiceCallConfig.TestWebService;
        client = WebServiceCallConfig.call(URL);
        methodName = WebServiceCallMethodConfig.register;

        user.setName("张三");
        user.setLogin("100982");
        //将JAVA对象转化换为JSON字符串
        requestData = JSONUtil.objectToJson(user);
        MD5Encrypt = CommonUtils.MD5Encrypt(requestData);
        try {
            Object[] responseDataBack = client.invoke(methodName, requestData, MD5Encrypt);
            String responseData = responseDataBack[0].toString();
            System.out.println(responseData);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return responseData;
    }


    @RequestMapping("callTestWebServiceList")
    public String callTestWbeServiceList() throws Exception {
        URL = WebServiceCallConfig.TestWebService;
        client = WebServiceCallConfig.call(URL);
        methodName = WebServiceCallMethodConfig.registerList;
        batchId = UUID.randomUUID().toString();

        List<User> requestBodyList = userMapper.searchDataList();
        //将数据插入中间表
        userMapper.insertDataList(requestBodyList);
        int requestBodyCount = requestBodyList.size();

        if (ObjectUtils.isEmpty(requestBodyList)) {
            return "暂无数据";
        }

        //将请求体数据转换为JSON
        String requestBody = JSONUtil.objectToJson(requestBodyList);
        /**
         * 组装请求数据
         */
        requestTemplate = new RequestTemplate.RequestTemplateBuilder()
                .setBatchId(batchId)                 //批次标识
                .setModule(Module.INPUT)                  //模块
                .setRequestTime(LocalDateTime.now())
                .setElapsedTime("耗时")             //耗时
                .setRequestBodyCount(requestBodyCount)         //请求体数量
                .setRequestStatus(Status.SUCCESS)           //请求状态
                .setRequestStatusMessage("成功")    //请求状态信息
                .setRequestBody(requestBody)          //请求体数据
                .build();
        //将请求数据转换为JSON
        requestData = JSONUtil.objectToJson(requestTemplate);
        //将下传数据用MD5加密
        MD5Encrypt = CommonUtils.MD5Encrypt(requestData);
        //下传前插入日志
        LOGGER.info(requestTemplate.toString());
        //并将其请求数据日志插入数据库
        requestTemplate = logService.insertRequestTemplate(requestTemplate);

        try {
            //调用接口
            responseDataBack = client.invoke(methodName, requestData, MD5Encrypt);

        } catch (Exception e) {
            String a = "接口调用失败+";
            String ExceptionMessage = a + ExpertionLin.Infor(e);
            ResponseTemplate responseTemplateError = new ResponseTemplate.ResponseTemplateBuilder()
                    .setBatchId(batchId)
                    .setModule(Module.INPUT)
                    .setResponseTime(LocalDateTime.now())
                    .setResponseStatus(Status.ERROR)
                    .setResponseStatusMessage(ExceptionMessage)
                    .build();
            //记录响应失败数据日志
            LOGGER.error(responseTemplateError.toString());
            //根据batchId更新请求后的失败响应数据
            logService.updateResponseTemplateError(responseTemplateError);
            throw e;
        }


        //处理接口返回数据
        responseData = responseDataBack[0].toString();
        ResponseTemplate responseTemplate = JSONUtil.jsonToEntity(responseData, ResponseTemplate.class);
        LOGGER.info(responseTemplate.toString());
        //根据batchId更新请求后的响应数据

        List<ResponseTemplateBody> responseTemplateBodyList = JSONUtil.jsonToList(responseTemplate.getResponseTemplateBody(),ResponseTemplateBody.class);

        for (ResponseTemplateBody responseTemplateBody : responseTemplateBodyList) {
            String NATURALKEY = responseTemplateBody.getNaturalKey();
            String STATUS = responseTemplateBody.getStatus();
            String MESSAGE = responseTemplateBody.getMessage();
            if (StringUtils.isNoneBlank(NATURALKEY, STATUS, MESSAGE)) {
                //根据状态更新原数据状态

                //int aa =
                //插入日志

                //数据库日志更新


       }
        }



      /*  responseTemplate.getResponseStatus();
        responseTemplate.getResponseStatusMessage();
        responseTemplate.getResponseCount();
        responseTemplate.getResponseErrorCount();
        responseTemplate.getResponseSuccessCount();
        responseTemplate.getResponseTime();*/



        return "1";

    }
}
