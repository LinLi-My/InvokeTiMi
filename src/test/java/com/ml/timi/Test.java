/**
 * ClassName:
 * Description:
 * Date:           2021 2021/7/29 13:50
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi;


import com.ml.timi.utils.DateTool;

//import java.time.*;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Test {





    public static void main(String[] args) {


        /*{
            int a = 0;
        }
        int a = 0;*/
      /* // LocalDateTime.now()
        LocalDateTime a = LocalDateTime.parse("2021-07-23T08:14:01.209");
        System.out.println(a);
        String b = DateTool.TimeCalculation(a, DateTool.UNIT_YEARS);
        System.out.println(b);*/
        /*  List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(4, 5, 6);
        Collections.copy(dest, source);
        System.out.println(source);
        System.out.println(dest);
        String batchId = UUID.randomUUID().toString();
        System.out.println(batchId);
        long snowTool = new SnowTool(0, 10).nextId();
        System.out.println(snowTool);
        RequestTemplate r = new RequestTemplate();*/

        LocalDateTime start = LocalDateTime.of(2020, 11, 19, 6, 15, 0,123);
        LocalDateTime end = LocalDateTime.of(2020, 11, 19, 8, 15, 0,124);
        //LocalDateTime start = LocalDateTime.parse("2021-09-23T16:51:01.209");
        //LocalDateTime end = LocalDateTime.now();
        Duration d = Duration.between(start, end);
        System.out.println(d.toMillis()); // PT1235H10M30S

        Period p = LocalDate.of(2020, 11, 19).until(LocalDate.of(2021, 12, 20));
        System.out.println(p); // P1M21D


        Duration duration = Duration.ofDays(1);//设置一天时间
        long timeHours = duration.toHours();//小时
        long timeMinutes = duration.toMinutes();//分钟
        long timeMillis = duration.toMillis();//毫秒
        long timeNanos = duration.toNanos();//纳秒
        String timeString = duration.toString(); //此持续时间的字符串表示形式,使用基于ISO-8601秒*的表示形式,例如 PT8H6M12.345S
        System.out.println("timeHours时间="+timeHours);
        System.out.println("timeMinutes时间="+timeMinutes);
        System.out.println("timeMillis时间="+timeMillis);
        System.out.println("timeNanos时间="+timeNanos);
        System.out.println("timeString时间="+timeString);


        long todayTimeMillis = System.currentTimeMillis();
        long yesterdayTimeMillis = todayTimeMillis - 24 * 60 * 60 * 1000;
        Instant start1 = Instant.ofEpochMilli(yesterdayTimeMillis);
        Instant end1 = Instant.ofEpochMilli(todayTimeMillis);

        Duration duration1 = Duration.between(start1, end1);
        System.out.println("天数="+duration1.toMillis());


        Duration d1 = Duration.ofHours(10); // 10 hours
        Duration d2 = Duration.parse("P1DT2H3M"); // 1 day, 2 hours, 3 minutes


    }
}
