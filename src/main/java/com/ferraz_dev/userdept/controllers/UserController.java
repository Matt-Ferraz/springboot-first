package com.ferraz_dev.userdept.controllers;

import com.ferraz_dev.userdept.entities.User;
import com.ferraz_dev.userdept.repositories.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

// RestController will set up the class to respond requisitions
// RequestMapping will set up the route
@RestController
@RequestMapping(value = "/users")
public class UserController {
    // create an instace with dependency injection
    @Autowired
    private UserRepository repository;

    // acess and return all users on db
    // Set GET method
    @GetMapping
    public List<User> findAll() {
        // List<User> allUserResult = repository.findAll();
        // return allUserResult;
        // shorter way to
        return repository.findAll();
    }
    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        if(id == null) throw new IllegalArgumentException();
        
        User user = repository.findById(id).get();
        return user;
    }
}
