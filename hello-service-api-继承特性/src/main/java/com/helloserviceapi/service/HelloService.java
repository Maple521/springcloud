package com.helloserviceapi.service;

import com.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
