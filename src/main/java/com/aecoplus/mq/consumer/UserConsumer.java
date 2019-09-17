package com.aecoplus.mq.consumer;

import com.aecoplus.mq.entity.User;
import com.aecoplus.mq.service.BlogService;
import com.aecoplus.mq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aecoplus
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = "${rocketmq.consumer.topics.user.name}", consumerGroup = "${rocketmq.consumer.topics.user.consumerGroup}")
public class UserConsumer implements RocketMQListener<User> {

    @Autowired
    private UserService userService;

    @Override
    public void onMessage(User user) {
        userService.saveUser(user);
    }

}