package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.EWallet;


public interface EwalletService {
    Iterable <EWallet> getAllEWallet();

    EWallet createdEWallet(EWallet eWallet);

    void updateEWallet(Long id, EWallet eWallet);

    void deleteEWallet(Long id);
}
