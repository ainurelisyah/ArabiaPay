package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Spring.SpringBootMysql.Service.VendorService;
import com.Spring.SpringBootMysql.model.Vendor;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class VendorController {
    

    @Autowired
    VendorService vendorService;

    //TO GET ALL VENDORS
    @GetMapping("/vendorlist")
    public Iterable<Vendor> getAllVendor() {
        return vendorService.getAllVendor();
    }

    //TO CREATE NEW VENDOR
    @PostMapping("/registervendor")
    public Vendor createdvendor(@RequestBody Vendor vendor) {

        if (vendor == null) throw new NullPointerException();
        return vendorService.createdVendor(vendor);
    }

    //TO EDIT THE INFO OF EXISTING VENDOR
    @PutMapping("/editvendor/{id}")
    public void updateVendor (@PathVariable Long id, @RequestBody Vendor updateVendor) {
        
        if (updateVendor == null) throw new NullPointerException();
        vendorService.updateVendor(id, updateVendor);
    }

    //DELETE VENDOR
     @DeleteMapping("/deletevendor")
     public void deleteVendor(@RequestParam Long id) {
         vendorService.deleteVendor(id);
    }
}
