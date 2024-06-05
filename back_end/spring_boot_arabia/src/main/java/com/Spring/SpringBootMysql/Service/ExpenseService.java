package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.ExpenseTracker;

public interface ExpenseService {
    
    Iterable <ExpenseTracker> getExpenses ();

    ExpenseTracker createdExpenses (ExpenseTracker expense);
}
