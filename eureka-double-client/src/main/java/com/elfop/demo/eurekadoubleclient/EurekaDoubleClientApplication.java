package com.elfop.demo.eurekadoubleclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/22  14:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaDoubleClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDoubleClientApplication.class, args);
    }

}
