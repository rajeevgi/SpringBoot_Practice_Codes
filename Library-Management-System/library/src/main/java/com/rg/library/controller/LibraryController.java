package com.rg.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.library.entity.Book;
import com.rg.library.entity.Library;
import com.rg.library.service.LibraryService;

@RestController
@RequestMapping("/api/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/createLibrary")
    public Library createLibrary(@RequestBody Library library){
        return libraryService.createLibrary(library);
    }

    @GetMapping("/getAllLibraries")
    public List<Library> getAllLibraries(){
        return libraryService.getAllLibraries();
    }

    @GetMapping("/getLibraryById/{id}")
    public Library getLibraryById(@PathVariable int id){
        return libraryService.getLibraryById(id);
    }

    @PostMapping("/{id}/addBookToLibrary")
    public Book addBookToLibrary(@PathVariable int id, @RequestBody Book book){
        return libraryService.addBookToLibrary(id, book);
    }

    @GetMapping("/{id}/getBooksInLibrary")
    public List<Book> getBooksInLibrary(@PathVariable int id){
        return libraryService.getBooksInLibrary(id);
    }
}
