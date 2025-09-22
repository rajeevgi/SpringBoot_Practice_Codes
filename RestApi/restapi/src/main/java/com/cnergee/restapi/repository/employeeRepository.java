package com.cnergee.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnergee.restapi.entity.Employees;

@Repository
public interface employeeRepository extends JpaRepository<Employees, Integer> {

}
