package com.spring.cloud.alibaba.service;

import com.spring.cloud.alibaba.service.fallback.ConsumerFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(value = "cloud-alibaba-provider-9003", path = "/provider", fallback = ConsumerFeignServiceFallback.class)
public interface ConsumerFeignService {

    @RequestMapping("/user")
    public Map user();
}
