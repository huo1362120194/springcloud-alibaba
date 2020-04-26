package com.spring.cloud.alibaba.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AlibabaConsumerServiceImplFallback {

    public static Map fallback(Throwable e){
        Map map = new HashMap();
        map.put("errCode","0002");
        map.put("errMsg", "fallback:" + UUID.randomUUID().toString());
        return map;
    }
}
