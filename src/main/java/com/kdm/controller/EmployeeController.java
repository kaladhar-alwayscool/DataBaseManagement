package com.kdm.controller;

import com.kdm.entity.Employee;
import com.kdm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @PostMapping(path = "/addEmployee")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return ResponseEntity.ok("Message sent successfully");
    }
}
