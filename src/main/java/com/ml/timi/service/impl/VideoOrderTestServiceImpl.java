package com.ml.timi.service.impl;

import com.ml.timi.model.entity.VideoOrderTest;
import com.ml.timi.mapper.VideoOrderTestMapper;
import com.ml.timi.service.VideoOrderTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 视频订单表——测试(VideoOrderTest)表服务实现类
 *
 * @author Lin
 * @since 2021-08-25 14:52:13
 */
@Service("videoOrderTestService")
public class VideoOrderTestServiceImpl implements VideoOrderTestService {
    @Resource
    private VideoOrderTestMapper videoOrderTestMapper;

    /**
     * 通过实体作为筛选条件查询
     * 查询条件为空时，则默认查询全部
     *
     * @param videoOrderTest VideoOrderTest对象
     * @return VideoOrderTest集合
     */
    @Override
    public List<VideoOrderTest> search(VideoOrderTest videoOrderTest) {

        return this.videoOrderTestMapper.search(videoOrderTest);
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public VideoOrderTest searchById(Integer id) {
        return this.videoOrderTestMapper.searchById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VideoOrderTest> searchAllByLimit(int offset, int limit) {
        return this.videoOrderTestMapper.searchAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param videoOrderTest 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(VideoOrderTest videoOrderTest) {
        return this.videoOrderTestMapper.insert(videoOrderTest);

    }

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderTestList VideoOrderTest对象集合
     * @return 影响行数
     */
    @Override
    public int insertBatch(List<VideoOrderTest> videoOrderTestList) {
        return this.videoOrderTestMapper.insertBatch(videoOrderTestList);
    }

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param  videoOrderTestList VideoOrderTest对象集合
     * @return 影响行数
     */
    @Override
    public int insertOrUpdateBatch(List<VideoOrderTest> videoOrderTestList) {
        return this.videoOrderTestMapper.insertOrUpdateBatch(videoOrderTestList);
    }

    /**
     * 修改数据
     *
     * @param videoOrderTest VideoOrderTest对象
     * @return 实例对象
     */
    @Override
    public VideoOrderTest update(VideoOrderTest videoOrderTest) {
        this.videoOrderTestMapper.update(videoOrderTest);
        return this.searchById(videoOrderTest.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Override
    public int deleteById(Integer id) {
        return this.videoOrderTestMapper.deleteById(id);
    }
}
