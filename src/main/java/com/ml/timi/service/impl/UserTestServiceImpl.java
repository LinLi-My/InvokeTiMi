package com.ml.timi.service.impl;

import com.ml.timi.model.entity.UserTest;
import com.ml.timi.mapper.UserTestMapper;
import com.ml.timi.service.UserTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

/**
 * 用户中间表(UserTest)表服务实现类
 *
 * @author Lin
 * @since 2021-08-25 14:52:01
 */
@Service("userTestService")
public class UserTestServiceImpl implements UserTestService {
    @Resource
    private UserTestMapper userTestMapper;

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param userTest UserTest对象
     * @return UserTest集合
     */
    @Override
    public List<UserTest> search(UserTest userTest) {

        return this.userTestMapper.search(userTest);
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserTest searchById(BigInteger id) {
        return this.userTestMapper.searchById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserTest> searchAllByLimit(int offset, int limit) {
        return this.userTestMapper.searchAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userTest 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(UserTest userTest) {
        return this.userTestMapper.insert(userTest);

    }

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  userTestList UserTest对象集合
     * @return 影响行数
     */
    @Override
    public int insertBatch(List<UserTest> userTestList) {
        return this.userTestMapper.insertBatch(userTestList);
    }

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  userTestList UserTest对象集合
     * @return 影响行数
     */
    @Override
    public int insertOrUpdateBatch(List<UserTest> userTestList) {
        return this.userTestMapper.insertOrUpdateBatch(userTestList);
    }

    /**
     * 修改数据
     *
     * @param userTest UserTest对象
     * @return 实例对象
     */
    @Override
    public UserTest update(UserTest userTest) {
        this.userTestMapper.update(userTest);
        return this.searchById(userTest.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Override
    public int deleteById(BigInteger id) {
        return this.userTestMapper.deleteById(id);
    }
}
