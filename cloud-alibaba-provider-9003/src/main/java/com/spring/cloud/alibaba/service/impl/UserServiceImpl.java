package com.spring.cloud.alibaba.service.impl;

import com.spring.cloud.alibaba.entity.User;
import com.spring.cloud.alibaba.mapper.UserMapper;
import com.spring.cloud.alibaba.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        logger.info("{}查询走的是数据库",id);
        return userMapper.findUserById(id);
    }

    @Override
    public User updateUser(User user) {
        userMapper.updateUser(user);
        return user;
    }

    @Override
    public int create(User user) {
        return userMapper.create(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
