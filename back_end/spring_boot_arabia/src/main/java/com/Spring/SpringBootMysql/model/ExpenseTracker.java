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
@Table(name = "expense_tracker")
public class ExpenseTracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expensetracker_id;
    @NotBlank
    private Long client_id;

    @JsonIgnore
    @Column(nullable = false, updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date date;

    @NotBlank
    private Double total_amount;

    @NotBlank
    private Double target_month;

    public Long getExpensetrackerID() {
        return expensetracker_id;
    }
    public void setExpensetrackerID(Long expensetrackerID) {
        this.expensetracker_id = expensetrackerID;
    }

    public Long getUserID() {
        return client_id;
    }
    public void setUserID(Long client_id) {
        this.client_id = client_id;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalAmount() {
        return total_amount;
    }
    public void setTotalAmount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Double getTarget_month() {
        return target_month;
    }
    public void setTarget_month(Double target_month) {
        this.target_month = target_month;
    }
}
