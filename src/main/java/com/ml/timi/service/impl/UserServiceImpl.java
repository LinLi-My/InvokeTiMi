package com.ml.timi.service.impl;

import com.ml.timi.model.entity.User;
import com.ml.timi.mapper.UserMapper;
import com.ml.timi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(User)表服务实现类
 *
 * @author Lin
 * @since 2021-08-27 16:58:14
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param user User对象
     * @return User集合
     */
    @Override
    public List<User> searchByStatus(User user) {

        return this.userMapper.search(user);
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User searchById(Long id) {
        return this.userMapper.searchById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> searchAllByLimit(int offset, int limit) {
        return this.userMapper.searchAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(User user) {
        return this.userMapper.insert(user);

    }

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  userList User对象集合
     * @return 影响行数
     */
    @Override
    public int insertBatch(List<User> userList) {
        return this.userMapper.insertBatch(userList);
    }

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  userList User对象集合
     * @return 影响行数
     */
    @Override
    public int insertOrUpdateBatch(List<User> userList) {
        return this.userMapper.insertOrUpdateBatch(userList);
    }

    /**
     * 修改数据
     *
     * @param user User对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userMapper.update(user);
        return this.searchById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Override
    public int deleteById(Long id) {
        return this.userMapper.deleteById(id);
    }
}
