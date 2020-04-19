package com.spring.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/provider")
public class AlibabaProviderController {

    @RequestMapping("/query")
    public Map query(){
        Map map = new HashMap();
        map.put("result", UUID.randomUUID().toString());
        return map;
    }

    @RequestMapping("/user")
    public Map user(){
        Map map = new HashMap();
        map.put("user", "xiaoxiao: " + UUID.randomUUID().toString());
        return map;
    }
}
