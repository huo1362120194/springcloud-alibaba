package com.spring.cloud.alibaba.service;


import com.spring.cloud.alibaba.entity.User;

public interface UserService {

    public User findUserById(Integer id);
    public User updateUser(User user);
    public int create(User user);
    public int deleteUserById(Integer id);
}
