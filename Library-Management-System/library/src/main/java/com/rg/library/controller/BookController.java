package com.rg.library.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.library.entity.Author;
import com.rg.library.entity.Book;
import com.rg.library.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/createBook")
    public Book creaeBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllbooks();
    }

    @PostMapping("/{id}/assignAuthors")
    public Book assignAuthors(@PathVariable int id, @RequestBody Set<Integer> authorIds) {
        return bookService.assignAuthors(id, authorIds);
    }

    @GetMapping("/{id}/getAuthors")
    public Set<Author> getAuthors(@PathVariable int id){
        return bookService.getAuthors(id);
    }
    
}   
