package com.spring.cloud.alibaba.controller;

import com.spring.cloud.alibaba.service.AlibabaConsumerService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/consumer")
@RefreshScope
public class AlibabaConsumerController {

    private static String PROVIDER_URL = "http://cloud-alibaba-provider-9003";

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private AlibabaConsumerService alibabaConsumerService;

    @RequestMapping("/query")
    public Map query(){
        return alibabaConsumerService.query();
    }

    @RequestMapping("/user")
    public Map user(){
        return alibabaConsumerService.user();
    }

    @RequestMapping("/get/user")
    public Map getUser(){
        Map map = restTemplate.postForObject(PROVIDER_URL + "/provider/user", null, Map.class);
        return map;
    }

    @GlobalTransactional
    @RequestMapping("/del/{id}")
    public Map getUser(@PathVariable(name = "id") Integer id){
        alibabaConsumerService.deleteUserById(id + 1);
        Map map = restTemplate.postForObject(PROVIDER_URL + "/provider/del/" + id, null, Map.class);
        return map;
    }
}
