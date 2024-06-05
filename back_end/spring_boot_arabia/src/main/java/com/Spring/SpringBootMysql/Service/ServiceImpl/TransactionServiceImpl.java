package com.Spring.SpringBootMysql.Service.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Spring.SpringBootMysql.Service.TransactionService;
import com.Spring.SpringBootMysql.model.Transaction;
import com.Spring.SpringBootMysql.repository.TransactionRepo;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepo transactionRepo;

    @Override
    public Iterable<Transaction> getTransaction() {
        return transactionRepo.findAll();
    }

    @Override
    public Transaction createdTransaction(Transaction transaction) {
        return transactionRepo.save(transaction);
    }
    
}
