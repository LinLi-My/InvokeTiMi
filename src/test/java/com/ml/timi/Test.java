/**
 * ClassName:
 * Description:
 * Date:           2021 2021/7/29 13:50
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi;


import com.ml.timi.model.log.request.RequestTemplate;
import com.ml.timi.utils.SnowTool;

import java.util.UUID;

public class Test {



    public static void main(String[] args) {

       String batchId = UUID.randomUUID().toString();
        System.out.println(batchId);
        long snowTool = new SnowTool(0,10).nextId();
        System.out.println(snowTool);
        RequestTemplate r = new RequestTemplate();


    }
}
