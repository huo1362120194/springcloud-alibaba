package com.spring.cloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * nacos 1.1.4
 * sentinel 1.7.1
 */
//启动类排除数据源自动注入
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.spring.cloud.alibaba.mapper")
public class CloudAlibabaConsumer9004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumer9004Application.class, args);
    }

}
