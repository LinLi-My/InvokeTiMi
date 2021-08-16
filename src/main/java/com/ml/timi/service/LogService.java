package com.ml.timi.service;

import com.ml.timi.model.log.request.RequestTemplate;
import org.springframework.stereotype.Service;

/**
 * 请求头日志(RequestTemplate)表服务接口
 *
 * @author makejava
 * @since 2021-08-13 14:05:13
 */

@Service
public interface LogService {


    /**
     * 新增请求数据全部模板日志
     *
     * @param requestTemplate 实例对象
     * @return 实例对象
     */
    RequestTemplate insertRequestTemplate(RequestTemplate requestTemplate);

    /**
     * 新增
     *
     * @param requestBody 实例对象集合
     * @return 实例对象
     */
    //List insertResponseBody(List<RequestBody> requestBody );


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     *//*
    RequestTemplate queryById(Integer id);

    *//**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     *//*
    List<RequestTemplate> queryAllByLimit(int offset, int limit);



    *//**
     * 修改数据
     *
     * @param requestTemplate 实例对象
     * @return 实例对象
     *//*
    RequestTemplate update(RequestTemplate requestTemplate);

    *//**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     *//*
    boolean deleteById(Integer id);*/

}
