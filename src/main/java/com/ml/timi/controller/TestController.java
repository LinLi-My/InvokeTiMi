/**
 * ClassName:
 * Description:    测试
 * Date:           2022 2022/2/9 16:32
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.ml.timi.utils.LocalDateTimeAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    /** 格式化JSON */
    private Gson gson = new GsonBuilder()
            .setPrettyPrinting()                                                    //格式化输出的json
            .serializeNulls()                                                       //有NULL值是也进行解析
            .disableHtmlEscaping()                                                  //解析特殊符号
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())   //为某特定对象设置固定的序列或反序列方式，自定义Adapter需实现JsonSerializer或者JsonDeserializer接口序列化[LocalDateTime的解析]
            .registerTypeAdapter(JsonElement.class, new LocalDateTimeAdapter())     //反序列化LocalDateTime(String——>LocalDateTime)的解析
            .create();
    @GetMapping("oacall")
    public String oaCall(String qq,HttpServletRequest request) throws InterruptedException {



        String jsonpCallback = request.getParameter("jsonpCallback");
        String id = request.getParameter("id");
        System.out.println("已调用"+jsonpCallback);
        System.out.println(id);

        Map<String,String> map = new HashMap<String,String>();
        map.put("id","返回-87634");
        map.put("name","返回-李凌");
        String responseJsonpData = gson.toJson(map);
        return jsonpCallback + "("+responseJsonpData+")";
    }

}
