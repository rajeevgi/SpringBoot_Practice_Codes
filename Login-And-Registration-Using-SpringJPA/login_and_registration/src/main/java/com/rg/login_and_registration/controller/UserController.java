package com.rg.login_and_registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.login_and_registration.entity.User;
import com.rg.login_and_registration.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registration(@RequestBody User user){
       return userService.registration(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
       return userService.login(user.getEmail(), user.getPassword());
    }
}
