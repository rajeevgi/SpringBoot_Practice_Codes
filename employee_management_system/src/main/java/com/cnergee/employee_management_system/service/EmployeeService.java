package com.cnergee.employee_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cnergee.employee_management_system.entity.Employee;
import com.cnergee.employee_management_system.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseEntity<String> deleteEmployeeById(int empId) {
        Employee getEmployee = employeeRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found!"));

        employeeRepository.delete(getEmployee);
        return ResponseEntity.ok("Employee Deleted Sucessfully..");
    }

    public ResponseEntity<String> updateEmployeeById(int empId, Employee employee) {
        Employee updateEmp = employeeRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found!"));

        updateEmp.setEmpName(employee.getEmpName());
        updateEmp.setAge(employee.getAge());
        updateEmp.setAddress(employee.getAddress());

        employeeRepository.save(updateEmp);

        return ResponseEntity.ok("Employee Updated Successfully...");

    }

}
