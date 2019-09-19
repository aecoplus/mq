package com.aecoplus.mq.service.impl;

import com.aecoplus.mq.entity.Blog;
import com.aecoplus.mq.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @author aecoplus
 */
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {

    @Override
    public void saveBlog(String blog){
        log.info("******consumer message: blog is saved");
        log.info(blog);
    }
}
