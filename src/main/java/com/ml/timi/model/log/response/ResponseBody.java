package com.ml.timi.model.log.response;

import java.io.Serializable;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * (ResponseBody)实体类
 *
 * @author Lin
 * @since 2021-08-30 09:42:34
 */

@Data
@Component
public class ResponseBody implements Serializable {

    private static final long serialVersionUID = 385157276387914894L;

    /** 业务主键 */
    private String naturalkey;
    /** 状态 */
    private String status;
    /** 信息 */
    private String message;
    /** 主键 */
    private int id;


}

