package com.arun.employee.employeeApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping
    public String getEmployee() {
        return "Hello World";
    }
}
