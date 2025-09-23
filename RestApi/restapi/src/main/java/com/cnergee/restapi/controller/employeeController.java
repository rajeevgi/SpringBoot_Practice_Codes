package com.cnergee.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnergee.restapi.entity.Employees;
import com.cnergee.restapi.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class employeeController {

    @Autowired
    private EmployeeService employeeService;

    // Get API to get list of employees
    @GetMapping("/listAllEmployees")
    public List<Employees> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // Get Employees By ID
    @GetMapping("/getEmployeeById/{id}")
    public Employees getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }


    // Add Employees
    @PostMapping("/addEmployees")
    public Employees saveEmployees(@Valid @RequestBody Employees employees){
        return employeeService.addEmployees(employees);
    }

    // Update Employees Record
    @PutMapping("/updateEmployees/{id}")
    public String updateEmployeesById(@Valid @RequestBody Employees updatedEmployee, @PathVariable int id){
        return employeeService.updateEmployees(id, updatedEmployee);
    }

    // Delete Employees Record
    @DeleteMapping("/deleteEmployeeById/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

}
