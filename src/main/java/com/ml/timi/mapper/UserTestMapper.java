package com.ml.timi.mapper;

import com.ml.timi.model.entity.UserTest;
import com.ml.timi.model.log.response.ResponseBody;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/**
 * 用户中间表(UserTest)表数据库访问层
 *
 * @author Lin
 * @since 2021-08-27 17:00:50
 */
@Mapper
public interface UserTestMapper {

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param userTest UserTest对象
     * @return UserTest集合
     */
    List<UserTest> search(UserTest userTest);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserTest searchById(int id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserTest> searchAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param userTest UserTest对象
     * @return 影响行数
     */
    int insert(UserTest userTest);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  userTestList UserTest对象集合
     * @return 影响行数
     */
    int insertBatch(List<UserTest> userTestList);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  userTestList UserTest对象集合
     * @return 影响行数
     */
    int insertOrUpdateBatch(List<UserTest> userTestList);

    /**
     * 修改数据
     *
     * @param userTest UserTest对象
     * @return 影响行数
     */
    int update(UserTest userTest);


    /**
     * 修改数据
     *
     * @param responseBody ResponseBody对象
     * @return 影响行数
     */
    int updateStatusByNaturalkey(ResponseBody responseBody);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(BigInteger id);

}

