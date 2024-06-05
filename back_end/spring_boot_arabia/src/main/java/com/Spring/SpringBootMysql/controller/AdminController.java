package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.Spring.SpringBootMysql.Service.AdminService;
import com.Spring.SpringBootMysql.model.Admin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class AdminController {
    
    @Autowired
    AdminService adminService;

    //GET ADMIN INFO
    @GetMapping("/admininfo")
    public Iterable<Admin> getAdmin() {
        return adminService.getAdmin();
    }

    //POST ADMIN
    @PostMapping ("/addadmin")
    public Admin createdAdmin (@RequestBody Admin admin) {
        
        if (admin == null) throw new NullPointerException();
        return adminService.createdAdmin(admin);
    }

    //EDIT ADMIN INFO
    @PutMapping ("/editadmin/{id}")
    public void updateAdmin(@PathVariable Long id, @RequestBody Admin updateAdmin) {

        if (updateAdmin == null) throw new NullPointerException();
        adminService.updateAdmin(id, updateAdmin);
    }

    //DELETE ADMIN
    @DeleteMapping("/deleteadmin")
    public void deleteAdmin(@RequestParam Long id) {
        adminService.deleteAdmin(id);
    }
}
