package com.elfop.demo.eurekaconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/25  10:55
 */
@Configuration
public class RestTemplateConf {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
