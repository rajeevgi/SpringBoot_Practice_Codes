package com.rg.employee_management_system_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rg.employee_management_system_mvc.entity.Employee;
import com.rg.employee_management_system_mvc.service.EmployeeService;


@Controller
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Home Page
    @GetMapping("/home")
    public String homepage(){
        return "index";
    }

    // Get All Employees
    @GetMapping("/listAllEmployees")
    public String getAllEmployees(Model model){
        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("employees", employees);
        return "list-employees";
    }

    // Show Add Form
    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    // Add Employee
    @PostMapping("/saveEmployee")
    public String addEmployee(@ModelAttribute Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/api/employees/listAllEmployees";
    }

    // Show Edit Form and Update
    @GetMapping("/updateEmployee/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-form";
    }

    // Delete Employee
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return "redirect:/api/employees/listAllEmployees";
    }
}
