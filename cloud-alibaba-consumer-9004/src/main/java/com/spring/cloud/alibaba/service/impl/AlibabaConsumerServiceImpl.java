package com.spring.cloud.alibaba.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.spring.cloud.alibaba.mapper.UserMapper;
import com.spring.cloud.alibaba.service.AlibabaConsumerService;
import com.spring.cloud.alibaba.service.AlibabaConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@RefreshScope
public class AlibabaConsumerServiceImpl implements AlibabaConsumerService {

    @Value("${country:}")
    private String country;

    @Resource
    private UserMapper userMapper;

    @Autowired
    private AlibabaConsumerFeignService alibabaConsumerFeignService;

    @SentinelResource(
            value = "consumer",
            blockHandlerClass = AlibabaConsumerServiceImplBlockHandler.class,
            blockHandler = "blockHandler",
            fallbackClass = AlibabaConsumerServiceImplFallback.class,
            fallback = "fallback"
    )
    @Override
    public Map query() {
        //int i = 1 / 0;
        Map map = new HashMap();
        map.put("country",country);
        map.put("uuid", UUID.randomUUID().toString());
        return map;
    }

    @Override
    public Map user() {
        Map map = new HashMap();
        Map result = alibabaConsumerFeignService.user();
        map.put("result",result);
        return map;
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
