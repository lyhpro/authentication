package com.authentication.back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupRequest {
    
    private String secondname;
    private String firstname;
    private String email;
    private String password;

}
