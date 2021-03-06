package com.ml.timi.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 视频订单表——测试(VideoOrderTest)实体类
 *
 * @author Lin
 * @since 2021-08-25 14:52:11
 */

@Data
@Component
public class VideoOrderTest implements Serializable {

    private static final long serialVersionUID = 662488771226463273L;

    /** 主键 */
    private Integer id;
    /** 订单唯一标识 */
    private String outTradeNo;
    /** 0表示未支付，1表示已支付 */
    private Integer state;
    /** 订单生成时间 */
    private LocalDateTime createTime;
    /** 支付金额，单位分 */
    private Integer totalFee;
    /** 视频主键 */
    private Integer videoId;
    /** 视频标题 */
    private String videoTitle;
    /** 视频图片 */
    private String videoImg;
    /** 用户id */
    private Integer userId;


}

