package com.Spring.SpringBootMysql.repository;


import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.ExpenseTracker;


public interface ExpenseRepo extends CrudRepository <ExpenseTracker, Long> {
    
}
