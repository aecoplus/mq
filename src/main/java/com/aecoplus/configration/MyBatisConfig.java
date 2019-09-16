package com.aecoplus.configration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author aecoplus
 */
@Configuration
@MapperScan(value = {"com.aecoplus.**.mapper.**"})
public class MyBatisConfig {
}
