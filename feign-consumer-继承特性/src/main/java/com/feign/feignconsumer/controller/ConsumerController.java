package com.feign.feignconsumer.controller;

import com.feign.feignconsumer.service.RefactorHelloService;
import com.helloserviceapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("whb")).append("\n");
        sb.append(refactorHelloService.hello("whb", 20)).append("\n");
        sb.append(refactorHelloService.hello(new User("whb", 20))).append("\n");
        return sb.toString();
    }
}