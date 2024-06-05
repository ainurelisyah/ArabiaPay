package com.Spring.SpringBootMysql.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "ewallet")
public class EWallet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ewallet_id;
    @NotBlank
    private Long client_id;
    @NotBlank
    private Integer ewallet_no;
    @NotBlank
    private Double balance;
    @NotBlank
    private boolean status;
    


    public Long getEwalletID() {
        return ewallet_id;
    }
    public void setEwalletID(Long ewallet_id) {
        this.ewallet_id = ewallet_id;
    }

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getUser_id() {
        return client_id;
    }
    public void setUser_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getEwallet_id() {
        return ewallet_id;
    }
    public void setEwallet_id(Long ewallet_id) {
        this.ewallet_id = ewallet_id;
    }
    

}
