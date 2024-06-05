package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.Spring.SpringBootMysql.model.User;

public interface UserRepo extends CrudRepository<User, Long> {
    
    User findByUsernameAndPassword(String username, String password);
}
