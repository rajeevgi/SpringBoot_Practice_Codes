package com.rg.session_based_login_and_register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.session_based_login_and_register.entity.User;
import com.rg.session_based_login_and_register.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {
        if(userRepository.findByEmail(user.getEmail())!= null){
            return "User Already Exists!";
        }
        userRepository.save(user);
        return "User Register Sucessfully...";
    }

    public String login(String email, String password, HttpSession session) {
        User user = userRepository.findByEmail((email));

        if(user != null && user.getPassword().equals(password)){
            session.setAttribute("user", user.getUsername());
            return "Login Sucessfull...";
        }

        return "Invalid Credentials...";
    }

    public String logout(HttpSession session) {
       session.invalidate();
       return "User Logged-out";
    }
}
