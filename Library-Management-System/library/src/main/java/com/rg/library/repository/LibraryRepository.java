package com.rg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rg.library.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
