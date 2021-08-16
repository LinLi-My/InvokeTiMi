/**
 * ClassName:
 * Description:
 * Date:           2021 2021/7/23 10:58
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi.model.log.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ResponseTemplateBody {
    /** 业务主键 */
    private String naturalKey;

    /** 状态 */
    private String status;

    /** 信息 */
    private String message;



}
