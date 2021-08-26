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
import org.assertj.core.util.DateUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Test {


    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(4, 5, 6);
        Collections.copy(dest, source);
        System.out.println(source);
        System.out.println(dest);
        String batchId = UUID.randomUUID().toString();
        System.out.println(batchId);
        long snowTool = new SnowTool(0, 10).nextId();
        System.out.println(snowTool);
        RequestTemplate r = new RequestTemplate();


    }
}
