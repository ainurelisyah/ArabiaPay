package com.Spring.SpringBootMysql.repository;


import com.Spring.SpringBootMysql.model.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepo extends CrudRepository<Client, Long> {
    
}
