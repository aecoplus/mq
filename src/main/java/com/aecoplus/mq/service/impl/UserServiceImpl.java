package com.aecoplus.mq.service.impl;

import com.aecoplus.mq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @author aecoplus
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(String user){
        log.info(user);
        System.out.println("******consumer message: user is saved");
    }
}
