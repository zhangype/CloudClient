package com.zhangype.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 应用启动类
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/1/9
 */
// 启用REST 客户端
@EnableFeignClients
// 启用服务发现
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

}
