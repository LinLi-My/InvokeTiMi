package com.ml.timi.service;

import com.ml.timi.model.entity.User;
import com.ml.timi.model.log.response.ResponseBody;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表(User)表服务接口
 *
 * @author Lin
 * @since 2021-08-27 16:58:14
 */
@Service
public interface UserService {
    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param user User对象
     * @return User集合
     */
    List<User> searchByStatus(User user);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User searchById(Long id);


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> searchAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  userList User对象集合
     * @return 影响行数
     */
    int insertBatch(List<User> userList);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  userList User对象集合
     * @return 影响行数
     */
    int insertOrUpdateBatch(List<User> userList);

    /**
     * 修改数据
     *
     * @param user User对象
     * @return 实例对象
     */
    User update(User user);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);


}
