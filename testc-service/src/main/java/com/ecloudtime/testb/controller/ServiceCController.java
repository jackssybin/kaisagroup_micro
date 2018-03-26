package com.ecloudtime.testb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
public class ServiceCController {

    @Autowired
    EurekaDiscoveryClient discoveryClient;

    @Value("${msg:unknown}")
    private String msg;

    @RequestMapping(value = "/",method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String printServiceB() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>Say " + msg;
    }
}