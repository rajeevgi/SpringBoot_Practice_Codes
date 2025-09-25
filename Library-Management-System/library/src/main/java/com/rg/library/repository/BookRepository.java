package com.rg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rg.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
