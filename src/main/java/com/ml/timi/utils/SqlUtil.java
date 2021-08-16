/**
 * ClassName:
 * Description:
 * Date:           2021 2021/7/19 9:26
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi.utils;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class SqlUtil {
    /**
     * Method               insertForEachList
     * Description          批量插入数据
     * Author               Lin
     * Date                 2021/8/6 15:13
     * Version              1.0.0
     * @param           listData        插入数据的集合
     * @param           tClass          插入数据的类
     * @param           parameterTypes  插入的参数类型
     * @param           groupSize       分组大小
     * @param           methodName      方法名称
     * @param           sqlSessionFactory
     * @return          java.lang.Object
     */
    public static <T> Object insertForEachList(List<T> listData, Class tClass, Class parameterTypes, int groupSize, String methodName, SqlSessionFactory sqlSessionFactory) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Method method = tClass.getMethod(methodName, parameterTypes);
        //分组次数
        int groupCount = listData.size() / groupSize;
        //ExecutorType.BATCH:设置为批量提交     autoCommit:默认为false，不自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        Object methodObject = sqlSession.getMapper(tClass);
        try {
            //优化批量插入
            if (listData.size() <= groupSize) {
                method.invoke(methodObject, listData);
            } else {
                List subList = new ArrayList();
                for (int i = 0; i < groupCount; i++) {
                    subList = listData.subList(0, groupSize);
                     method.invoke(methodObject, subList);
                    listData.subList(0, groupSize).clear();
                }
                if (listData.size() > 0) {
                    method.invoke(methodObject, listData);
                }
            }
            sqlSession.commit();
            return 2;
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return 1;
    }
}
