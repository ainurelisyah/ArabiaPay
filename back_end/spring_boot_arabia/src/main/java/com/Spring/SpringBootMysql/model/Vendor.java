package com.Spring.SpringBootMysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendor_id;

    private String username;
    private String password;
    private String email;
    private String phone_no;
    private String user_id;

    public Long getVendorID() {
        return vendor_id;
    }

    public void setVendorID(Long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phone_no;
    }

    public void setPhoneNo(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getUserLevelID() {
        return user_id;
    }

    public void setUserLevelID(String user_id) {
        this.user_id = user_id;
    }
}