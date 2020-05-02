package com.spring.cloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.spring.cloud.alibaba.mapper")
public class CloudAlibabaProvider9003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProvider9003Application.class, args);
    }

}
