package com.mgcloud.employee_tracker.controller;

import com.mgcloud.employee_tracker.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public String viewEmployeeList(Model model) {
        // Add the list of employees to the model so the HTML can use it
        model.addAttribute("employeeList", employeeRepository.findAll());
        // Return the name of the HTML file (employees.html)
        return "employees";
    }

    // Optional: Add a mapping for the root URL
    @GetMapping("/")
    public String home() {
        return "redirect:/employees";
    }
}

