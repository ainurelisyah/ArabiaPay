package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.Spring.SpringBootMysql.model.Product;

public interface ProductRepo extends CrudRepository <Product, Long> {
    
}
