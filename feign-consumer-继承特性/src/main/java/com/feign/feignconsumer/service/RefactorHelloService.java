package com.feign.feignconsumer.service;

import com.helloserviceapi.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {

}
