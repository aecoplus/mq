package com.aecoplus.mq.service.impl;

import com.aecoplus.mq.entity.Blog;
import com.aecoplus.mq.service.BlogService;
import org.springframework.stereotype.Service;


/**
 * @author aecoplus
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Override
    public void saveBlog(Blog blog){
        System.out.println("******consumer message: blog is saved");
    }
}
