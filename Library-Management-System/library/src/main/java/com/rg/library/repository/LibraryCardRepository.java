package com.rg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rg.library.entity.LibraryCard;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard, Integer> {

}
