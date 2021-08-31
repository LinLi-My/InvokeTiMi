package com.ml.timi.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户表(User)实体类
 *
 * @author Lin
 * @since 2021-08-27 16:58:14
 */

@Data
@Component
public class User implements Serializable {

    private static final long serialVersionUID = 123478402100362506L;


    private Long id;
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
    /** 状态标识 */
    private String status;

    private List<VideoOrder> videoOrderList;


}

