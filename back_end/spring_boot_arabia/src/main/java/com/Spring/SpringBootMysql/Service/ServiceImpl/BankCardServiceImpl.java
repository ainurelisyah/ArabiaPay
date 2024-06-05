package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.BankCardService;
import com.Spring.SpringBootMysql.model.BankCard;
import com.Spring.SpringBootMysql.repository.BankCardRepo;

@Service
@Transactional
public class BankCardServiceImpl implements BankCardService{
    
    @Autowired
    BankCardRepo bankCardRepo;

    //READ
    @Override
    public Iterable<BankCard> getAllBankCard() {
        return bankCardRepo.findAll();
    }

    //POST
    @Override
    public BankCard createdBankCard(BankCard bankCard) {
        return bankCardRepo.save(bankCard);
    }

    //EDIT
    @Override
    public void updateBankCard (Long id, BankCard updateBankCard){
        Optional <BankCard> bankCardToUpdateOptional = bankCardRepo.findById(id);
        
        if (bankCardToUpdateOptional.isPresent()) {
            BankCard bankCardToUpdate = bankCardToUpdateOptional.get();
            bankCardToUpdate.setBankName(updateBankCard.getBankName());
            bankCardToUpdate.setAccountNumber(updateBankCard.getAccountNumber());
            bankCardToUpdate.setCardType(updateBankCard.getCardType());
            bankCardToUpdate.setExpiredDate(updateBankCard.getExpiredDate());
            bankCardToUpdate.setCcv(updateBankCard.getCcv());
            bankCardRepo.save(updateBankCard);
        }
    }

    //DELETE
    @Override
    public void deleteBankCard(Long id) {
        Optional<BankCard> bankCardToDeleteOptional = bankCardRepo.findById(id);

        if (bankCardToDeleteOptional.isPresent()) {
            BankCard bankCardToDelete = bankCardToDeleteOptional.get();
            bankCardRepo.delete(bankCardToDelete);
        }
    }

    


    
}
