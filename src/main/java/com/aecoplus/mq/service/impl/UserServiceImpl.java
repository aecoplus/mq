package com.aecoplus.mq.service.impl;

import com.aecoplus.mq.entity.User;
import com.aecoplus.mq.service.UserService;
import org.springframework.stereotype.Service;


/**
 * @author aecoplus
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user){
        System.out.println("blog is saved");
    }
}
