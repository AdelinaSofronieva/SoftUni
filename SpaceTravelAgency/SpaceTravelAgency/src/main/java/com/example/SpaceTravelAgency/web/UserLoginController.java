package com.example.SpaceTravelAgency.web;

import com.example.SpaceTravelAgency.models.dtos.UserLoginDTO;
import com.example.SpaceTravelAgency.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserLoginController {
    @GetMapping("/login")
    public String login() {
        return "auth-login";
    }


}
