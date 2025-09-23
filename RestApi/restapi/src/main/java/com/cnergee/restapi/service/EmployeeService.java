package com.cnergee.restapi.service;

import java.util.List;

import com.cnergee.restapi.entity.Employees;

public interface EmployeeService {

    // Save Employee
    Employees addEmployees(Employees employees);

    // Get All Employees
    List<Employees> getAllEmployees();

    // Get Employee By Id
    Employees getEmployeeById(int id);

    // Update Employees
    String updateEmployees(int id, Employees employees);

    // Delete Employee
    String deleteEmployee(int id);

}
