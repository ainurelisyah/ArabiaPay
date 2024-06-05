package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.VendorService;
import com.Spring.SpringBootMysql.model.Vendor;
import com.Spring.SpringBootMysql.repository.VendorRepo;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {
    
    @Autowired
    private VendorRepo vendorRepo;

    //GET LIST OF VENDORS
    @Override
    public Iterable<Vendor> getAllVendor() {
       return vendorRepo.findAll();
    }

    //POST NEW VENDOR
    @Override
    public Vendor createdVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    //EDIT VENDOR
    @Override
    public void updateVendor(Long id, Vendor updateVendor) {
        Optional <Vendor> vendorToUpdateOptional = vendorRepo.findById(id);

        if (vendorToUpdateOptional.isPresent()) {
            Vendor vendorToUpdate = vendorToUpdateOptional.get();
            vendorToUpdate.setUsername(updateVendor.getUsername());
            vendorToUpdate.setPassword(updateVendor.getPassword());
            vendorToUpdate.setPhoneNo(updateVendor.getPhoneNo());
            vendorToUpdate.setEmail(vendorToUpdate.getEmail());
            vendorRepo.save(vendorToUpdate);
        }
    }
    
    //DELET VENDOR
    @Override
    public void deleteVendor(Long id) {
        Optional <Vendor> vendorToDeleteOptional = vendorRepo.findById(id);

        if (vendorToDeleteOptional.isPresent()) {
            Vendor vendorToDelete = vendorToDeleteOptional.get();
            vendorRepo.delete(vendorToDelete);
        }
    }

}
