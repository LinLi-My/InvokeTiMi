/**
 * ClassName:
 * Description:
 * Date:           2021 2021/12/10 13:32
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

public class LoginInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String username;
    private String userpassword;


    public LoginInterceptor(String username, String userpassword){
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.userpassword = userpassword;

    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        /** 获取全部头信息 */
        List<Header> headers = message.getHeaders();
        /** 创建文档 */
        Document document = DOMUtils.createDocument();
        /** 认证数据信息 */
        Element auth = document.createElement("authority");
        Element username = document.createElement("username");
        Element userpassword = document.createElement("userpassword");
        username.setTextContent(this.username);
        userpassword.setTextContent(this.userpassword);
        auth.appendChild(username);
        auth.appendChild(userpassword);
        headers.add(0, new Header(new QName("authority"), auth));


    }
}
