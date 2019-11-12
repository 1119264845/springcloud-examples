package com.elfop.demo.eurekaconsumerribbon.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/22  15:02
 */
@RestController
@RequestMapping("discovery")
public class DcController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {

        return restTemplate.getForObject("http://eureka-client-demo/discovery/services", String.class);
    }

}
