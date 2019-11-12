package com.elfop.demo.eurekaconsumerfeign.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/10/28  14:12
 */
@RestController
@RequestMapping("discovery")
public class DcController {

    @Resource
    private Discovery discovery;

    @GetMapping("/consumer")
    public String dc() {
        return discovery.consumer();
    }

}
