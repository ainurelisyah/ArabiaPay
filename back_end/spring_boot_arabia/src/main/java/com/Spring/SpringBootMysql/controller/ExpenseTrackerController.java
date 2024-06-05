package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.ExpenseService;
import com.Spring.SpringBootMysql.model.ExpenseTracker;
import com.Spring.SpringBootMysql.repository.ExpenseRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class ExpenseTrackerController {
    
    @Autowired
    ExpenseRepo expenseRepo;
    @Autowired
    ExpenseService expenseServive;

    //GET EXPENSE INFO
    @GetMapping ("/expense")
    public Iterable <ExpenseTracker> getExpenses () {
        return expenseServive.getExpenses();
    }

    //POST NEW EXPENSE
    @PostMapping("/newexpense")
    public ExpenseTracker createExpenses (@RequestBody ExpenseTracker expense) {
        return expenseServive.createdExpenses(expense);
    }


    
}
