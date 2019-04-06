package com.feign.feignconsumer.controller;

import com.feign.feignconsumer.model.User;
import com.feign.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("maple")).append("\n");
        sb.append(helloService.hello("maple", 18)).append("\n");
        sb.append(helloService.hello(new User("maple", 18))).append("\n");
        return sb.toString();
    }
}