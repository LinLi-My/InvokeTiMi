package com.ml.timi.service.impl;


import com.ml.timi.mapper.log.RequestTemplateMapper;
import com.ml.timi.mapper.log.ResponseTemplateMapper;
import com.ml.timi.model.log.request.RequestTemplate;
import com.ml.timi.model.log.response.ResponseTemplate;
import com.ml.timi.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 请求头日志(RequestTemplate)表服务实现类
 *
 * @author makejava
 * @since 2021-08-13 14:05:13
 */
@Service
public class LogServiceImpl implements LogService {

    @Resource
    private RequestTemplateMapper requestTemplateMapper;
    @Resource
    private ResponseTemplateMapper responseTemplateMapper;
    /**
     * 新增数据
     *
     * @param requestTemplate 实例对象
     * @return 实例对象
     */
    @Override
    public RequestTemplate insertRequestTemplate(RequestTemplate requestTemplate) {
        requestTemplateMapper.insertRequestTemplate(requestTemplate);
        return requestTemplate;
    }

    @Override
    public ResponseTemplate updateResponseTemplateError(ResponseTemplate responseTemplateError) {
        responseTemplateMapper.updateResponseTemplateError(responseTemplateError);
        return responseTemplateError;
    }

   /* @Override
    public List insertResponseBody(List<RequestBody> requestBody) {
        logMapper.insertResponseBody(requestBody);
        return requestBody;
    }*/

   /* @Resource
    private RequestTemplateDao requestTemplateDao;

    *//**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     *//*
    @Override
    public RequestTemplate queryById(Integer id) {
        return this.requestTemplateDao.queryById(id);
    }

    *//**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     *//*
    @Override
    public List<RequestTemplate> queryAllByLimit(int offset, int limit) {
        return this.requestTemplateDao.queryAllByLimit(offset, limit);
    }

    *//**
     * 新增数据
     *
     * @param requestTemplate 实例对象
     * @return 实例对象
     *//*
    @Override
    public RequestTemplate insert(RequestTemplate requestTemplate) {
        this.requestTemplateDao.insert(requestTemplate);
        return requestTemplate;
    }

    *//**
     * 修改数据
     *
     * @param requestTemplate 实例对象
     * @return 实例对象
     *//*
    @Override
    public RequestTemplate update(RequestTemplate requestTemplate) {
        this.requestTemplateDao.update(requestTemplate);
        return this.queryById(requestTemplate.getId());
    }

    *//**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     *//*
    @Override
    public boolean deleteById(Integer id) {
        return this.requestTemplateDao.deleteById(id) > 0;
    }*/
}
