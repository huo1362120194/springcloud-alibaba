package com.spring.cloud.alibaba.service.impl;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AlibabaConsumerServiceImplBlockHandler {

    public static Map blockHandler(BlockException e){
        Map map = new HashMap();
        map.put("errCode","0001");
        map.put("errMsg", "blockHandler:" + UUID.randomUUID().toString());
        return map;
    }
}
