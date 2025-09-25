package com.rg.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.library.entity.Author;
import com.rg.library.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Create Author
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    // List Authors
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
