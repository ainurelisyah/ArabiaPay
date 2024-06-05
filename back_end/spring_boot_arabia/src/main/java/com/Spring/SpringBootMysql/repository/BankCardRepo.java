package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.Spring.SpringBootMysql.model.BankCard;

public interface BankCardRepo extends CrudRepository <BankCard, Long> {
    
}
