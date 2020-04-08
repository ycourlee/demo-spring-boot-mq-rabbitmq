package com.example.demospringbootmqrabbitmq.dao;

import com.example.demospringbootmqrabbitmq.pojo.User;

/**
 * @author jy
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}