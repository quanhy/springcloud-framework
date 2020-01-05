package com.example.ribbon.com.example.ribbon.controller;

import com.example.ribbon.com.example.ribbon.service.AdminRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRibbonController {

    @Autowired
    private AdminRibbonService adminRibbonService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "message") String message){
        return adminRibbonService.sayHi(message);
    }

}
