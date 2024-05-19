package com.authentication.back.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.back.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
    Optional<User> findByEmail(String email);
    User findByRoleId(long id);
    
}
