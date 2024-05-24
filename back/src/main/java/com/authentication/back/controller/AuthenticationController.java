package com.authentication.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/authentication")
public class AuthenticationController {
    
    @GetMapping("/hello")
    public String helloAuthentication() {
        return "Hello Authentication";
    }

}
