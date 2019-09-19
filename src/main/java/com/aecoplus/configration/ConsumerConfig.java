package com.aecoplus.configration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author aecoplus
 */
@Configuration
@Data
public class ConsumerConfig {

    @Value("${rocketmq.name-server}")
    private String namesrvAddr;
}
