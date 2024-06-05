package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.Spring.SpringBootMysql.model.Vendor;

public interface VendorRepo extends CrudRepository<Vendor, Long> {
    
}
