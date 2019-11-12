package com.elfop.demo.eurekaconsumerfeign.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/28  14:05
 */
@FeignClient("eureka-client-demo")
public interface Discovery {

    /**
     * 使用Feign绑定
     * @return
     */
    @GetMapping("/discovery/services")
    String consumer();


}
