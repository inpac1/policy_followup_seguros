package com.example.policy_followup.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("admin".equals(username)){
            return User.builder()
                    .username("admin")
                    .password("$2a$10$DLHQMRaAJzntMhVh7rkom.1KvYlPIq1kvCz9nXomQEcqX9GXszwVa")
                    .roles("ADMIN")
                    .build();
        }
        throw new UsernameNotFoundException("User not found"+ username);
    }


}
