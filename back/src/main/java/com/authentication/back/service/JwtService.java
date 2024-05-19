package com.authentication.back.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.authentication.back.model.User;

public interface JwtService {
    
    String generateToken(User userDetails);
    String extractUserName(String token);
    boolean isTokenValid(String token, UserDetails userDetails);
    boolean isTokenExpired(String token);

}
