package com.elfop.demo.eurekaclient.web;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private DiscoveryClient discoveryClient;

    @GetMapping("services")
    public String servicesInfo(){
        String services = "Services: " + discoveryClient.getServices();

        System.out.println(services);
        return services;
    }

    @GetMapping("order")
    public String orderInfo(){
        String order = "Order: " + discoveryClient.getOrder();

        System.out.println(order);
        return order;
    }

//    @GetMapping("order")
//    public String orderInfo(){
//        String order = "Order: " + discoveryClient.getInstances();
//
//        System.out.println(order);
//        return order;
//    }







}
