package com.ml.timi.mapper;

import com.ml.timi.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 视频订单表(VideoOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-25 13:40:26
 */
@Mapper
public interface VideoOrderMapper {

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param videoOrder VideoOrder对象
     * @return VideoOrder集合
     */
    List<VideoOrder> search(VideoOrder videoOrder);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VideoOrder searchById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VideoOrder> searchAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param videoOrder VideoOrder对象
     * @return 影响行数
     */
    int insert(VideoOrder videoOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderList VideoOrder对象集合
     * @return 影响行数
     */
    int insertBatch(List<VideoOrder> videoOrderList);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderList VideoOrder对象集合
     * @return 影响行数
     */
    int insertOrUpdateBatch(List<VideoOrder> videoOrderList);

    /**
     * 修改数据
     *
     * @param videoOrder VideoOrder对象
     * @return 影响行数
     */
    int update(VideoOrder videoOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}

