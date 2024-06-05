package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.Admin;

public interface AdminService {
    
    Iterable <Admin> getAdmin();

    Admin createdAdmin (Admin admin);

    void updateAdmin (Long id, Admin updateAdmin);

    void deleteAdmin(Long id);

}
