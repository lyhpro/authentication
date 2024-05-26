package com.authentication.back.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.authentication.back.model.JwtResponse;
import com.authentication.back.model.SigninRequest;
import com.authentication.back.model.User;
import com.authentication.back.repository.UserRepository;
import com.authentication.back.service.JwtService;
import com.authentication.back.service.SigninRequestService;

@Service
public class SigninRequestServiceImpl implements SigninRequestService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired 
    private UserRepository userRepository;


    @Override
    public JwtResponse signin(SigninRequest signinRequest) {
        
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signinRequest.getEmail(), signinRequest.getPassword()));
        User user = userRepository.findByEmail(signinRequest.getEmail()).orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));

        String jwt = jwtService.generateToken(user);

        JwtResponse jwtResponse = new JwtResponse();
        jwtResponse.setJwt(jwt);

        return jwtResponse;

    }
    
}
