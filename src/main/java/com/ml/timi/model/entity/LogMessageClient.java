package com.ml.timi.

/model/entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 请求头日志(LogMessageClient)实体类
 *
 * @author Lin
 * @since 2021-08-26 17:36:30
 */

@Data
@Component
public class LogMessageClient implements Serializable {

    private static final long serialVersionUID = 688643505510752260L;

    /** 批次ID */
    private String batchId;
    /** 模块 */
    private String module;
    /** 请求状态 */
    private String requestStatus;
    /** 请求状态信息 */
    private String requestStatusMessage;
    /** 请求时间 */
    private LocalDateTime requestTime;
    /** 请求数量 */
    private Integer requestBodyCount;
    /** 请求数据 */
    private String requestBody;
    /** 响应时间 */
    private LocalDateTime responseTime;
    /** 响应状态 */
    private String responseStatus;
    /** 响应状态信息 */
    private String responseStatusMessage;
    /** 响应数量 */
    private Integer responseCount;
    /** 响应成功数量 */
    private Integer responseSuccessCount;
    /** 响应失败数量 */
    private Integer responseErrorCount;
    /** 响应体 */
    private String responseTemplateBody;

    private Integer id;


}

