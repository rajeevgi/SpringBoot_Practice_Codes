package com.rg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rg.library.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
