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

import com.Spring.SpringBootMysql.Service.BankCardService;
import com.Spring.SpringBootMysql.model.BankCard;
import com.Spring.SpringBootMysql.repository.BankCardRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class BankCardController {
    
    @Autowired
    BankCardRepo bankCardRepo;
    @Autowired
    BankCardService bankCardService;

    //GET ALL BANKCARD NAME
    @GetMapping ("/card")
    public Iterable <BankCard> getAllBankCard () {
        return bankCardService.getAllBankCard();
    }

    //POST NEW BANKCARD
    @PostMapping ("/addcard")
    public BankCard createdBankCard (@RequestBody BankCard bankCard) {
        
        if (bankCard == null) throw new NullPointerException();
        return bankCardService.createdBankCard(bankCard);
    }

    //UPDATE/EDIT EXISTING BANK CARD
    @PutMapping ("/editcard")
    public void updateBankCard(@PathVariable Long id, @RequestBody BankCard updateBankCard) {

        if (updateBankCard == null) throw new NullPointerException();
        bankCardService.updateBankCard(id, updateBankCard);
    }

    //DELETE BANK CARD
     @DeleteMapping("/deletecard")
     public void deleteBankCard(@RequestParam Long id) {
         bankCardService.deleteBankCard(id);
     }
}
