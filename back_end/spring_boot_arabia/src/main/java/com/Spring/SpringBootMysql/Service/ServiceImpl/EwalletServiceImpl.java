package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.EwalletService;
import com.Spring.SpringBootMysql.model.EWallet;
import com.Spring.SpringBootMysql.repository.EwalletRepo;

@Service
@Transactional
public class EwalletServiceImpl implements EwalletService {
    
    @Autowired
    private EwalletRepo ewalletRepo;

    //READ
    @Override
    public Iterable<EWallet> getAllEWallet() {
        return ewalletRepo.findAll();
    }

    //POST
    @Override
    public EWallet createdEWallet(EWallet eWallet) {
        return ewalletRepo.save(eWallet);
    }

    //EDIT
    @Override
    public void updateEWallet(Long id, EWallet updateEWallet) {
        Optional<EWallet> eWalletToUpdateOptional = ewalletRepo.findById(id);

        if (eWalletToUpdateOptional.isPresent()) {
            EWallet eWalletToUpdate = eWalletToUpdateOptional.get();
            eWalletToUpdate.setBalance(updateEWallet.getBalance());
            ewalletRepo.save(eWalletToUpdate);
        }
    }

    //DELETE 
    @Override
    public void deleteEWallet(Long id) {
        Optional<EWallet> eWalletToDeleteOptional = ewalletRepo.findById(id);

        if (eWalletToDeleteOptional.isPresent()) {
            EWallet eWalletToDelete = eWalletToDeleteOptional.get();
            ewalletRepo.delete(eWalletToDelete);
        }
    }
    
}
