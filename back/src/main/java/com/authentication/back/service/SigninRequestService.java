package com.authentication.back.service;

import com.authentication.back.model.JwtResponse;
import com.authentication.back.model.SigninRequest;

public interface SigninRequestService {
    
    JwtResponse signin(SigninRequest signinRequest);
    
}
