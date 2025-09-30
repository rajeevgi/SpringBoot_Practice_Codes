package com.rg.library.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.library.entity.Author;
import com.rg.library.entity.Book;
import com.rg.library.repository.AuthorRepository;
import com.rg.library.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    // Create Book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // List books
    public List<Book> getAllbooks() {
        return bookRepository.findAll();
    }

    // Assign Authors to Books
    public Book assignAuthors(int bookId, Set<Integer> authorIds) {
        Book book = bookRepository.findById(bookId).orElseThrow();

        Set<Author> authors = new HashSet<>(authorRepository.findAllById(authorIds));

        book.setAuthors(authors);

        return bookRepository.save(book);
    }

    // Get Authors
    public Set<Author> getAuthors(int bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow();

        return book.getAuthors();
    }
}
