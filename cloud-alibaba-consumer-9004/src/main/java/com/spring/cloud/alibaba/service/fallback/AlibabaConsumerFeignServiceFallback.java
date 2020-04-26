package com.spring.cloud.alibaba.service.fallback;

import com.spring.cloud.alibaba.service.AlibabaConsumerFeignService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class AlibabaConsumerFeignServiceFallback implements AlibabaConsumerFeignService {
    @Override
    public Map user() {
        Map map = new HashMap();
        map.put("errCode","0003");
        map.put("errMsg", "fallback:" + UUID.randomUUID().toString());
        return map;
    }
}
