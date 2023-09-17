package com.ferraz_dev.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferraz_dev.userdept.entities.Department;

import com.ferraz_dev.userdept.repositories.DepartmentRepository;


// Transform the class into a request controller and give it a route
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;

    // GET method will return all departments
    @GetMapping(value = "/all")
    public List<Department> findAll() {
        return repository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Department getById(@PathVariable Long id) {
        if(id == null) throw new IllegalArgumentException();
        
        Department department = repository.findById(id).get();
        return department;
    }

    @PostMapping
    public Department insertUser(@RequestBody Department department) {
        return repository.save(department);
    }
}
