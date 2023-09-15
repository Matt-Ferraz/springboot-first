package com.ferraz_dev.userdept.entities;

public class Department {
    // create a private attributes for the department
    private Long id;
    private String name;
    
    // create a constructor for the department
    public Department() {

    }

    // BASIC METHODS
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
}


