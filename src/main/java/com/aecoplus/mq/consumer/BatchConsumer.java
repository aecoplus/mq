package com.aecoplus.mq.consumer;

import com.aecoplus.mq.entity.Blog;
import com.aecoplus.mq.service.BlogService;
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
@RocketMQMessageListener(topic = "${rocketmq.consumer.topics.batch.name}", consumerGroup = "${rocketmq.consumer.topics.batch.consumerGroup}")
public class BatchConsumer implements RocketMQListener<Blog> {

    @Autowired
    private BlogService blogService;

    @Override
    public void onMessage(Blog blog) {
        blogService.saveBlog(blog.toString());
    }

}
