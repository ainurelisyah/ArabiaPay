package com.Spring.SpringBootMysql.Service;


import com.Spring.SpringBootMysql.model.Vendor;

public interface VendorService {
    
    Iterable <Vendor> getAllVendor();

    Vendor createdVendor(Vendor vendor);

    void updateVendor (Long id, Vendor updateVendor);

    void deleteVendor(Long id);
}
