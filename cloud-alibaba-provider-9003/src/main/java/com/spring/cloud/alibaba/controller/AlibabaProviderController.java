package com.spring.cloud.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/provider")
public class AlibabaProviderController {

    @RequestMapping("/query")
    @ResponseBody
    public Map query(){
        Map map = new HashMap();
        map.put("result", UUID.randomUUID().toString());
        return map;
    }

    @RequestMapping("/user")
    @ResponseBody
    public Map user(){
        //int i = 1/0;
        Map map = new HashMap();
        map.put("user", "xiaoxiao: " + UUID.randomUUID().toString());
        return map;
    }
}
