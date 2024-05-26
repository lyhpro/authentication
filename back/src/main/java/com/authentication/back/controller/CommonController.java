package com.authentication.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-authentication/common")
public class CommonController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> helloCommon() {
        return ResponseEntity.ok("Hello Common");
    }

}
