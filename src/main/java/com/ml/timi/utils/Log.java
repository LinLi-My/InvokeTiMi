
package com.ml.timi.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public  void setLog(String temp, String body){
        //下传前插入日志 ，
        LOGGER.info(temp);

        //并将其日志插入数据库
        //xxxxxx
        LOGGER.info(body);
        //并将其日志插入数据库
        //xxxxxx
    }
    public  void setInfo(String message ){
        //下传前插入日志 ，
        LOGGER.info(message);
        //并将其日志插入数据库
        //xxxxxx
    }

    public  void setError(String message ){
        LOGGER.error(message);
        //并将其日志插入数据库
        //xxxxxx
    }

}
