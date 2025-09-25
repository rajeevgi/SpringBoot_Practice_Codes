package com.rg.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.library.entity.Book;
import com.rg.library.entity.Library;
import com.rg.library.repository.BookRepository;
import com.rg.library.repository.LibraryRepository;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private BookRepository bookRepository;

    // Create Library Card
    public Library createLibrary(Library library){
        return libraryRepository.save(library);
    }

    // List Of Libraries
    public List<Library> getAllLibraries(){
        return libraryRepository.findAll();
    }

    // Get Library By Id
    public Library getLibraryById(int id){
        return libraryRepository.findById(id).orElse(null);
    }

    // Add Books to Library
    public Book addBookToLibrary(int id, Book book){
        Library library = getLibraryById(id);   // Find The Library First
        book.setLibrary(library);    // Set The Library to book
        return bookRepository.save(book); // Saved Book to Library
    }

    // List All Books From Library
    public List<Book> getBooksInLibrary(int id){
        Library library = getLibraryById(id);

        return library.getBooks();
    }
}
