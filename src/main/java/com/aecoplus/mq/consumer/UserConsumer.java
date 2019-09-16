package com.aecoplus.mq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.springframework.stereotype.Service;

/**
 * @author aecoplus
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = "${rocketmq.consumer.topics.user.name}", consumerGroup = "${rocketmq.consumer.topics.user.consumerGroup}")
public class UserConsumer {
}
