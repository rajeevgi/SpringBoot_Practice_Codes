package com.rg.employee_management_system_mvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.employee_management_system_mvc.entity.Employee;
import com.rg.employee_management_system_mvc.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found!"));
    }

    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id); 
        return "Employee Deleted Sucessfully...";
    }

    
}
