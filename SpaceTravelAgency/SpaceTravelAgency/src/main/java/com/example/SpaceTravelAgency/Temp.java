package com.example.SpaceTravelAgency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
//crypt password "123456"
public class Temp implements CommandLineRunner {
    private PasswordEncoder passwordEncoder;

    public Temp(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(passwordEncoder.encode("123456"));
        //52ffdc166e8695e8c156207a936a4b5441ee447ed3b09ca72e
    }
}
