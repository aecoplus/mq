package com.aecoplus.configration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author aecoplus
 * @since 2019-08-24
 */
@Configuration
@MapperScan(value = {"com.aecoplus.**.mapper.**"})
public class MyBatisConfig {
}
