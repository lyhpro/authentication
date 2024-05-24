package com.authentication.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/common")
public class CommonController {
    
    @GetMapping("/hello")
    public String helloCommon() {
        return "Hello Common";
    }

}
