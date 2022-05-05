/**
 * ClassName:      Key
 * Description:    公钥私钥
 * Date:           2022 2022/2/16 9:05
 * Author:         Lin
 * Copyright:      Lin
 */


package com.ml.timi.model.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Key {

    private String privateKey;
    private String publicKey;
}
