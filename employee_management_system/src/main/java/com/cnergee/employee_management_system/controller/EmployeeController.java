package com.cnergee.employee_management_system.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnergee.employee_management_system.entity.Employee;
import com.cnergee.employee_management_system.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/hello")
    public String greeting(){
        return "Hello, Rajeev!";
    }

    // Create an Employee
    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    // List All Employees
    @GetMapping("/listAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // Get Employees By Id
    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id)
                    .map(ResponseEntity :: ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    // Delete Employee
    @DeleteMapping("/deleteEmployee/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int empId){
        return employeeService.deleteEmployeeById(empId);
    }

    // Update an Employee
    @PutMapping("/updateEmployee/{empId}")
    public ResponseEntity<String> updateEmployee(@PathVariable int empId, @RequestBody Employee employee){
        return employeeService.updateEmployeeById(empId, employee);
    }
}
