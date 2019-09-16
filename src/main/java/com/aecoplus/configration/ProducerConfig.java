package com.aecoplus.configration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author aecoplus
 * @since 2019-08-31 21:39
 * @description yml文件配置读取类
 */
//@ConfigurationProperties(prefix="rocketmq.producer")
//@Component
//@Configuration
//@Data
public class ProducerConfig {

    private String namesrvAddr;

    private String groupName;
}
