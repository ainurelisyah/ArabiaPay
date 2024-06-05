package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.Transaction;

public interface TransactionRepo extends CrudRepository <Transaction, Long> {
    
}
