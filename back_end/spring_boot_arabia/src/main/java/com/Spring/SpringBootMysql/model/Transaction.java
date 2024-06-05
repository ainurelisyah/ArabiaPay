package com.Spring.SpringBootMysql.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "transaction")
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_id;
    @NotBlank
    private Long client_id;
    @NotBlank
    private Long ewallet_id;
    @NotBlank
    private Long vendor_id;

    @JsonIgnore
    @Column(nullable = false, updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date date;
    @NotBlank
    private Double amount;
    @NotBlank
    private String desc;
    @NotBlank
    private Boolean trans_status;


    public Long getTransactionID() {
        return transaction_id;
    }
    public void setTransactionID(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Long getUserID() {
        return client_id;
    }
    public void setUserID(Long client_id) {
        this.client_id = client_id;
    }

    public Long getEwalletID() {
        return ewallet_id;
    }
    public void setEwalletID(Long ewallet_id) {
        this.ewallet_id = ewallet_id;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getTransStatus() {
        return trans_status;
    }
    public void setTransStatus(Boolean trans_status) {
        this.trans_status = trans_status;
    }

    public Long getVendor_id() {
        return vendor_id;
    }
    public void setVendor_id(Long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
