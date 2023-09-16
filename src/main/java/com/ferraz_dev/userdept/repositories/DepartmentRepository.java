package com.ferraz_dev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferraz_dev.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
