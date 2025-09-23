package com.cnergee.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnergee.restapi.entity.Employees;
import com.cnergee.restapi.exception.EmployeeNotFoundException;
import com.cnergee.restapi.repository.employeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private employeeRepository repository;

    @Override
    public Employees addEmployees(Employees employees) {
        return repository.save(employees);
    }

    @Override
    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employees getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public String updateEmployees(int id, Employees employees) {
        repository.findById(id)
                .map(employee -> {
                    employee.setEmpName(employees.getEmpName());
                    employee.setEmail(employees.getEmail());
                    employee.setDepartment(employees.getDepartment());
                    employee.setSalary(employees.getSalary());

                    return repository.save(employee);
                }).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!!"));
        return "Employee Updated Successfully....";
    }

    @Override
    public String deleteEmployee(int id) {

        if (!repository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee Not Found!!!");
        }

        repository.deleteById(id);

        return "Employee deleted Successfully....";
    }

}
