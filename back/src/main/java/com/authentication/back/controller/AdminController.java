package com.authentication.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/admin")
public class AdminController {
    
    @GetMapping("/hello")
    public String helloAdmin() {
        return "Hello Admin";
    }
}
