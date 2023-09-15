package com.ferraz_dev.userdept.entities;

public class User {
    // Declare all private attributes of the user
    private Long id;
    private String name;
    private String email;


    // access the department class and asociate it to the user
    private Department department;

    // Constructor
    public User() {

    }

    // Get/Set methods for the User instance
    public Long getId() { 
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
