package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.AdminService;
import com.Spring.SpringBootMysql.model.Admin;
import com.Spring.SpringBootMysql.repository.AdminRepo;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Override
    public Iterable<Admin> getAdmin() {
        return adminRepo.findAll();
        
    }

    @Override
    public Admin createdAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    @Override
    public void updateAdmin(Long id, Admin updateAdmin) {
        Optional <Admin> adminToUpdateOptional = adminRepo.findById(id);
        
        if (adminToUpdateOptional.isPresent()) {
            Admin adminToUpdate = adminToUpdateOptional.get();
            adminToUpdate.setEmail(updateAdmin.getEmail());
            adminToUpdate.setPassword(updateAdmin.getPassword());
            adminToUpdate.setEmail(updateAdmin.getEmail());
            adminToUpdate.setPhoneNo(updateAdmin.getPhoneNo());
            adminToUpdate.setUsername(updateAdmin.getUsername());
            adminRepo.save(updateAdmin);
        }

    }

    @Override
    public void deleteAdmin(Long id) {
        Optional<Admin> adminToDeleteOptional = adminRepo.findById(id);

        if (adminToDeleteOptional.isPresent()) {
            Admin adminToDelete = adminToDeleteOptional.get();
            adminRepo.delete(adminToDelete);
        }
    }
    
}
