package com.authentication.back.service;

import com.authentication.back.model.SignupRequest;
import com.authentication.back.modeldto.UserDto;

public interface SignupRequestService {
    
    UserDto signup(SignupRequest signupRequest);
}
