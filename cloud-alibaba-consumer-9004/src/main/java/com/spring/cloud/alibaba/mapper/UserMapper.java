package com.spring.cloud.alibaba.mapper;

import com.spring.cloud.alibaba.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    User findUserById(@Param("id") Integer id);

    int updateUser(User user);

    int create(User user);

    int deleteUserById(@Param("id") Integer id);
}
