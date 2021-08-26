package com.ml.timi.mapper;

import com.ml.timi.model.entity.VideoOrderTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 视频订单表——测试(VideoOrderTest)表数据库访问层
 *
 * @author Lin
 * @since 2021-08-26 15:03:06
 */
@Mapper
public interface VideoOrderTestMapper {

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param videoOrderTest VideoOrderTest对象
     * @return VideoOrderTest集合
     */
    List<VideoOrderTest> search(VideoOrderTest videoOrderTest);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VideoOrderTest searchById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VideoOrderTest> searchAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param videoOrderTest VideoOrderTest对象
     * @return 影响行数
     */
    int insert(VideoOrderTest videoOrderTest);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderTestList VideoOrderTest对象集合
     * @return 影响行数
     */
    int insertBatch(List<VideoOrderTest> videoOrderTestList);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderTestList VideoOrderTest对象集合
     * @return 影响行数
     */
    int insertOrUpdateBatch(List<VideoOrderTest> videoOrderTestList);

    /**
     * 修改数据
     *
     * @param videoOrderTest VideoOrderTest对象
     * @return 影响行数
     */
    int update(VideoOrderTest videoOrderTest);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

