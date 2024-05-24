package com.authentication.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/user")
public class UserController {
    
    @GetMapping("/hello")
    public String helloUser() {
        return "Hello User";
    }

}
