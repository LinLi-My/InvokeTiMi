/**
 * ClassName:
 * Description:
 * Date:           2021 2021/11/3 10:02
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi;


import com.ml.timi.config.webservices.WebServiceCallConfig;
import com.ml.timi.config.webservices.WebServiceCallMethodConfig;
import com.ml.timi.interceptor.LoginInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class asd {


    public static void main(String[] args) {



        Double a = 1.2;
        Double c = a-1;
        Double d = 0.2;

        System.out.println(c);
        System.out.println(d);
        System.out.println(c==d);


        String ipAddress = "http://localhost:18888/webservice/AuthService?wsdl";
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client =   dcf.createClient(ipAddress);
        client.getOutInterceptors().add(new LoginInterceptor("Lin", "Lin1"));

        Object[] request = new Object[0];
        try {
            request = client.invoke("echo","1112222222222");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(request[0]);





    }

    private static class MD5Encrypt {
    }
}
