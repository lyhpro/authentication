package com.authentication.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/user")
public class UserController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> helloUser() {
        return ResponseEntity.ok("Hello User");
    }

}
