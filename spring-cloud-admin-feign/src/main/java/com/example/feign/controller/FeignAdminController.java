package com.example.feign.controller;

import com.example.feign.service.FeignAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignAdminController {
    @Autowired
    private FeignAdminService feignAdminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String message){
        return feignAdminService.sayHi(message);
    }
}
