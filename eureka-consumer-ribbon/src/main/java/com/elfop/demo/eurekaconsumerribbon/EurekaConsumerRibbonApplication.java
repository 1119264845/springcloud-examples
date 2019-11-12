package com.elfop.demo.eurekaconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/28  11:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }

}
