package com.rg.session_based_login_and_register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.session_based_login_and_register.entity.User;
import com.rg.session_based_login_and_register.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user, HttpSession session){
        return userService.login(user.getEmail(), user.getPassword(), session);
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        return userService.logout(session);
    }
}
