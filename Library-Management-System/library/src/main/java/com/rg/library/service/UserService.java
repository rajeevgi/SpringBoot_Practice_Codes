package com.rg.library.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.library.entity.LibraryCard;
import com.rg.library.entity.User;
import com.rg.library.repository.LibraryCardRepository;
import com.rg.library.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private LibraryCardRepository cardRepository;

    // Create User + Auto Generate library card
    public User createUser(User user){
        User savedUser = repository.save(user);

        LibraryCard card = LibraryCard.builder()
                .cardNumber("CARD-" + savedUser.getId())
                .issuDate(LocalDate.now())
                .users(savedUser)
                .build();

        cardRepository.save(card);
        savedUser.setCards(card);

        return savedUser;
    }

    // List All Users
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    // Get User By Id
    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

}
