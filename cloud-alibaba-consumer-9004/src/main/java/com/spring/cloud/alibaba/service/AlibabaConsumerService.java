package com.spring.cloud.alibaba.service;

import java.util.Map;

public interface AlibabaConsumerService {
    public Map query();

    public Map user();

    int deleteUserById(Integer id);
}
