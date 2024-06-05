package com.Spring.SpringBootMysql.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.SpringBootMysql.Service.ExpenseService;
import com.Spring.SpringBootMysql.model.ExpenseTracker;
import com.Spring.SpringBootMysql.repository.ExpenseRepo;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public Iterable<ExpenseTracker> getExpenses() {
        return expenseRepo.findAll();
    }

    @Override
    public ExpenseTracker createdExpenses(ExpenseTracker expense) {
       return expenseRepo.save(expense);
    }
    
}
