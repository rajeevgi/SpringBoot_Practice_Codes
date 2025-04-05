package com.rg.login_and_registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.login_and_registration.entity.User;
import com.rg.login_and_registration.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registration(User user) {
        if(userRepository.findByEmail(user.getEmail()) != null){
            return "User Already Exists!";
        }
        userRepository.save(user);
        return "User Registration Sucessfull..";
    }

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if(user != null && user.getPassword().equals(password)){
            return "Login Succesfull! Welcome " + user.getUsername();
        }
        return "Invalid Credentials";
    }

}
