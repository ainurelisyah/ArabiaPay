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

import com.Spring.SpringBootMysql.Service.EwalletService;
import com.Spring.SpringBootMysql.model.EWallet;
import com.Spring.SpringBootMysql.repository.EwalletRepo;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class EwalletController {

    @Autowired
    EwalletRepo ewalletRepo;
    @Autowired
    EwalletService ewalletService;
    
    //GET EWALLET INFO
    @GetMapping("/walletinfo")
    public Iterable<EWallet> getAllEWallet() {
        return ewalletService.getAllEWallet();
    }

    //POST NEW WALLET
    @PostMapping ("/createwallet")
    public EWallet createdEWallet (@RequestBody EWallet eWallet) {
        
        if (eWallet == null) throw new NullPointerException();
        return ewalletService.createdEWallet(eWallet);
    }

    //EDIT BALANCE IN WALLET
    @PutMapping("/editbalance/{id}")
    public void updateEWallet(@PathVariable Long id, @RequestBody EWallet updateEWallet) {

        if (updateEWallet == null) throw new NullPointerException();
        ewalletService.updateEWallet(id, updateEWallet);
    }

    //DELETE WALLET
     @DeleteMapping("/deletewallet")
     public void deleteEWallet(@RequestParam Long id) {
         ewalletService.deleteEWallet(id);
     }
}
