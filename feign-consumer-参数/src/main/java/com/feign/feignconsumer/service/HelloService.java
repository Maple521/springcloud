package com.feign.feignconsumer.service;

import com.feign.feignconsumer.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
