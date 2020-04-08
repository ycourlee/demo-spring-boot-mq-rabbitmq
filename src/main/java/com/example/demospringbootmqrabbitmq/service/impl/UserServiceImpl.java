package com.example.demospringbootmqrabbitmq.service.impl;

import com.example.demospringbootmqrabbitmq.dao.UserDao;
import com.example.demospringbootmqrabbitmq.pojo.User;
import com.example.demospringbootmqrabbitmq.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jy
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @RabbitListener(queues = {"jiangyong.news"})
    public void receive(User user) {
        log.info("received a message: " + user.toString());
    }
}
