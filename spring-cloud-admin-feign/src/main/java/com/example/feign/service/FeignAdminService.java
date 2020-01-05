package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service-admin")
public interface FeignAdminService {

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "message") String message);
}
