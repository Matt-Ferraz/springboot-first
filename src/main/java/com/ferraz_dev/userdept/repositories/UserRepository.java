package com.ferraz_dev.userdept.repositories;

import com.ferraz_dev.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
