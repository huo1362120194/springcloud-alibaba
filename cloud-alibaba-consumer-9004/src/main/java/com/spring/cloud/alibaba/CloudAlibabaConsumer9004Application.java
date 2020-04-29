package com.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * nacos 1.1.4
 * sentinel 1.7.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaConsumer9004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumer9004Application.class, args);
    }

}
