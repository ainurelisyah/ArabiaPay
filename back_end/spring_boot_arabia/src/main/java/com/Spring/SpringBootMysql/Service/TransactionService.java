package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.Transaction;

public interface TransactionService {
    
    Iterable <Transaction> getTransaction();

    Transaction createdTransaction (Transaction transaction);

    

}
