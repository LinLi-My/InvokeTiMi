package com.ml.timi.model.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户中间表(UserTest)实体类
 *
 * @author Lin
 * @since 2021-08-25 14:51:57
 */

@Data
@Component
public class UserTest implements Serializable {

    private static final long serialVersionUID = -92148467420288785L;


    private BigInteger id;
    /** 昵称 */
    private String name;
    /** 密码 */
    private String pwd;
    /** 头像 */
    private String headImg;
    /** 手机号 */
    private String phone;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 登陆账号 */
    private String login;
    /** 用户订单集合 */
    public List<VideoOrderTest> videoOrderList;


}

