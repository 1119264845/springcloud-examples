package com.elfop.demo.eurekaconsumer.web;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {

        String eurekaUrl = "/discovery/services";

        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-demo");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + eurekaUrl;
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("services")
    public String servicesInfo() {
        String services = "Services: " + discoveryClient.getServices();

        System.out.println(services);
        return services;
    }

    @GetMapping("order")
    public String orderInfo() {
        String order = "Order: " + discoveryClient.getOrder();

        System.out.println(order);
        return order;
    }


}
