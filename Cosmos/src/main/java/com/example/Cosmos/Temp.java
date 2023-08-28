package com.example.Cosmos;

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
        //78ce976db3d3cd7533a675a197df82537af8e31db4f761858afc9627d077413fd8394631c02e4a58
    }
}
