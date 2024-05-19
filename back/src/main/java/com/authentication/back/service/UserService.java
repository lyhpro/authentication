package com.authentication.back.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.authentication.back.model.User;

public interface UserService {
    
    UserDetailsService userDetailsService();
    User findByEmail(String email);

}
