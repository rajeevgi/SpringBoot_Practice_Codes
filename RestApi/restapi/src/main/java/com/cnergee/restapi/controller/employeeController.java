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
import com.cnergee.restapi.repository.employeeRepository;

@RestController
@RequestMapping("/api/employees")
public class employeeController {

    @Autowired
    private employeeRepository employeeRepository;

    // Get API to get list of employees
    @GetMapping("/listAllEmployees")
    public List<Employees> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // Get Employees By ID
    @GetMapping("/getEmployeeById/{id}")
    public Employees getEmployeeById(@PathVariable int id){
        return employeeRepository.findById(id).orElse(null);
    }


    // Add Employees
    @PostMapping("/addEmployees")
    public Employees saveEmployees(@RequestBody Employees employees){
        return employeeRepository.save(employees);
    }

    // Update Employees Record
    @PutMapping("/updateEmployees/{id}")
    public Employees updateEmployeesById(@RequestBody Employees updatedEmployee, @PathVariable int id){
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setEmpName(updatedEmployee.getEmpName());
                    employee.setEmail(updatedEmployee.getEmail());
                    employee.setDepartment(updatedEmployee.getDepartment());
                    employee.setSalary(updatedEmployee.getSalary());

                    return employeeRepository.save(employee);
                })
                .orElse(null);
    }

    // Delete Employees Record
    @DeleteMapping("/deleteEmployeeById/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        employeeRepository.deleteById(id);

        return "Employees Deleted successfully....";
    }


}
