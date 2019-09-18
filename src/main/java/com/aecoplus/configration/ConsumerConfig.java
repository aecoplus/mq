package com.aecoplus.configration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author aecoplus
 */
@ConfigurationProperties(prefix="rocketmq.consumer")
@Component
@Configuration
@Data
public class ConsumerConfig {

    @Value("${name-server}")
    private String namesrvAddr;
}
