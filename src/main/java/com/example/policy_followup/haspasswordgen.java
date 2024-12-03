package com.example.policy_followup;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class haspasswordgen {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "securitas"; // Replace with the actual password you want
        String hashedPassword = encoder.encode(rawPassword);
        System.out.println("Hashed Password: " + hashedPassword);
    }
}

