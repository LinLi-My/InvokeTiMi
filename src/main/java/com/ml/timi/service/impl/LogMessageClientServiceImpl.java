package com.ml.timi.service.impl;

import com.ml.timi.model.entity.LogMessageClient;
import com.ml.timi.mapper.LogMessageClientMapper;
import com.ml.timi.service.LogMessageClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 请求头日志(LogMessageClient)表服务实现类
 *
 * @author Lin
 * @since 2021-08-26 17:36:31
 */
@Service("logMessageClientService")
public class LogMessageClientServiceImpl implements LogMessageClientService {
    @Resource
    private LogMessageClientMapper logMessageClientMapper;

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param logMessageClient LogMessageClient对象
     * @return LogMessageClient集合
     */
    @Override
    public List<LogMessageClient> search(LogMessageClient logMessageClient) {

        return this.logMessageClientMapper.search(logMessageClient);
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogMessageClient searchById(Integer id) {
        return this.logMessageClientMapper.searchById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LogMessageClient> searchAllByLimit(int offset, int limit) {
        return this.logMessageClientMapper.searchAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logMessageClient 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(LogMessageClient logMessageClient) {
        return this.logMessageClientMapper.insert(logMessageClient);

    }

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  logMessageClientList LogMessageClient对象集合
     * @return 影响行数
     */
    @Override
    public int insertBatch(List<LogMessageClient> logMessageClientList) {
        return this.logMessageClientMapper.insertBatch(logMessageClientList);
    }

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  logMessageClientList LogMessageClient对象集合
     * @return 影响行数
     */
    @Override
    public int insertOrUpdateBatch(List<LogMessageClient> logMessageClientList) {
        return this.logMessageClientMapper.insertOrUpdateBatch(logMessageClientList);
    }

    /**
     * 修改数据
     *
     * @param logMessageClient LogMessageClient对象
     * @return 实例对象
     */
    @Override
    public LogMessageClient update(LogMessageClient logMessageClient) {
        this.logMessageClientMapper.update(logMessageClient);
        return this.searchById(logMessageClient.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Override
    public int deleteById(Integer id) {
        return this.logMessageClientMapper.deleteById(id);
    }
}
