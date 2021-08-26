package com.ml.timi.controller;

import com.ml.timi.modle.LogMessageClient;
import com.ml.timi.service.LogMessageClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 请求头日志(LogMessageClient)表控制层
 *
 * @author Lin
 * @since 2021-08-26 17:36:31
 */
@RestController
@RequestMapping("logMessageClient")
public class LogMessageClientController {
    /**
     * 服务对象
     */
    @Resource
    private LogMessageClientService logMessageClientService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogMessageClient selectOne(Integer id) {
        return this.logMessageClientService.queryById(id);
    }

}
