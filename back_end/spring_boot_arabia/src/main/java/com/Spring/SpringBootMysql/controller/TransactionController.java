package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.TransactionService;
import com.Spring.SpringBootMysql.model.Transaction;
import com.Spring.SpringBootMysql.repository.TransactionRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class TransactionController {

    @Autowired
    TransactionService transactionService;
    @Autowired
    TransactionRepo transactionRepo;

    //GET THE TRANSACTION
    @GetMapping ("/transaction")
    public Iterable<Transaction> getTransaction() {
        return transactionService.getTransaction();
    }

    //POST NEW TRANSACTION
    @PostMapping("/newtransaction")
    public Transaction createdTransaction (@RequestBody Transaction transaction) {
        return transactionService.createdTransaction(transaction);
    }
    
    
}
