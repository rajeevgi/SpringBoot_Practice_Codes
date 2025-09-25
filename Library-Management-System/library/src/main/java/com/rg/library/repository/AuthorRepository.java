package com.rg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rg.library.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
