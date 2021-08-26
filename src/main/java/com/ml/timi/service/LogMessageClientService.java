package com.ml.timi.service;

import com.ml.timi.model.entity.LogMessageClient;

import java.util.List;

/**
 * 请求头日志(LogMessageClient)表服务接口
 *
 * @author Lin
 * @since 2021-08-26 17:36:30
 */
@Service
public interface LogMessageClientService {
    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param logMessageClient LogMessageClient对象
     * @return LogMessageClient集合
     */
    List<LogMessageClient> search(LogMessageClient logMessageClient);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogMessageClient searchById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LogMessageClient> searchAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param logMessageClient 实例对象
     * @return 实例对象
     */
    int insert(LogMessageClient logMessageClient);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  logMessageClientList LogMessageClient对象集合
     * @return 影响行数
     */
    int insertBatch(List<LogMessageClient> logMessageClientList);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  logMessageClientList LogMessageClient对象集合
     * @return 影响行数
     */
    int insertOrUpdateBatch(List<LogMessageClient> logMessageClientList);

    /**
     * 修改数据
     *
     * @param logMessageClient LogMessageClient对象
     * @return 实例对象
     */
    LogMessageClient update(LogMessageClient logMessageClient);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
