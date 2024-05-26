package com.authentication.back.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.authentication.back.model.Role;
import com.authentication.back.model.SignupRequest;
import com.authentication.back.model.User;
import com.authentication.back.modeldto.UserDto;
import com.authentication.back.repository.RoleRepository;
import com.authentication.back.repository.UserRepository;
import com.authentication.back.service.SignupRequestService;

@Service
public class SignupRequestServiceImpl implements SignupRequestService {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto signup(SignupRequest signupRequest) {
        if(userServiceImpl.existsByEmail(signupRequest.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        Role role = roleRepository.findByName("USER");
        String encryptedPassword = passwordEncoder.encode(signupRequest.getPassword());
        User user = new User(signupRequest.getSecondname(), signupRequest.getFirstname(), signupRequest.getEmail(), encryptedPassword, role, true);
        User newUser = userRepository.save(user);

        return new UserDto(newUser);
    }
    
}
