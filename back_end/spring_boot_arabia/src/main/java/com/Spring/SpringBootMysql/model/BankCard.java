package com.Spring.SpringBootMysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "bank_card")
public class BankCard {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankcard_id;
    
    @NotBlank
    private Long ewallet_id;
    @NotBlank
    private Long account_number;
    @NotBlank
    private String card_type;
    @NotBlank
    private String bank_name;
    @NotBlank
    private Integer expired_date;
    @NotBlank
    private Integer ccv;

    public Long getBankCardID() {
        return bankcard_id;
    }
    public void setBankCardID(Long bankcard_id) {
        this.bankcard_id = bankcard_id;
    }

    public Long getEwalletID() {
        return ewallet_id;
    }
    public void setEwalletID(Long ewallet_id) {
        this.ewallet_id = ewallet_id;
    }

    public Long getAccountNumber() {
        return account_number;
    }
    public void setAccountNumber(Long account_number) {
        this.account_number = account_number;
    }

    public String getCardType() {
        return card_type;
    }
    public void setCardType(String card_type) {
        this.card_type = card_type;
    }

    public String getBankName() {
        return bank_name;
    }
    public void setBankName(String bank_name) {
        this.bank_name = bank_name;
    }

    public Integer getExpiredDate() {
        return expired_date;
    }
    public void setExpiredDate(Integer expired_date) {
        this.expired_date = expired_date;
    }

    public Integer getCcv() {
        return ccv;
    }
    public void setCcv(Integer ccv) {
        this.ccv = ccv;
    }


}
