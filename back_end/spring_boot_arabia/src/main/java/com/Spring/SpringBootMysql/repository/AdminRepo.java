package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.Admin;

public interface AdminRepo extends CrudRepository <Admin, Long> {
    
}
