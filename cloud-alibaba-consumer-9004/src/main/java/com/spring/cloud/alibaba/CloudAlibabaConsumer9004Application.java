package com.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaConsumer9004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumer9004Application.class, args);
    }

}
