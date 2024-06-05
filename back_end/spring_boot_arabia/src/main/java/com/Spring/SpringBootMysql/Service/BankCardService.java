package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.BankCard;

public interface BankCardService {
    
    Iterable<BankCard> getAllBankCard();

    BankCard createdBankCard (BankCard bankCard);

    void updateBankCard (Long id, BankCard updateBankCard);

    void deleteBankCard(Long id);
}
