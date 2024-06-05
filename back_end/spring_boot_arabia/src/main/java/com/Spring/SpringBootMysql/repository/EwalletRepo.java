package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.EWallet;

public interface EwalletRepo extends CrudRepository <EWallet, Long>{
    
}
