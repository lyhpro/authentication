package com.authentication.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.back.model.JwtResponse;
import com.authentication.back.model.SigninRequest;
import com.authentication.back.model.SignupRequest;
import com.authentication.back.modeldto.UserDto;
import com.authentication.back.service.SigninRequestService;
import com.authentication.back.service.SignupRequestService;

@RestController
@RequestMapping("/api-authentication/authentication")
public class AuthenticationController {
    
    @Autowired
    private SigninRequestService signinRequestService;

    @Autowired
    private SignupRequestService signupRequestService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloAuthentication() {
        return ResponseEntity.ok("Hello Authentication");
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtResponse> signin(@RequestBody SigninRequest signinRequest) {
        return ResponseEntity.ok(signinRequestService.signin(signinRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(@RequestBody SignupRequest signupRequest) {
        return ResponseEntity.ok(signupRequestService.signup(signupRequest));
    }

}
