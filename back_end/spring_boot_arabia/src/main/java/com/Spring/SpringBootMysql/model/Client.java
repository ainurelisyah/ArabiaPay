package com.Spring.SpringBootMysql.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
    @NotBlank
    private String phone_no;
    @NotBlank
    private Long ewallet_id;
    @NotBlank
    private String user_id;

    public Long getUserID() {
        return client_id;
    }

    public void setUserID(Long client_id) {
        this.client_id = client_id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
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

    public Long getEwalletID() {
        return ewallet_id;
    }

    public void setEwalletID(Long ewallet_id) {
        this.ewallet_id = ewallet_id;
    }

    public String getUserlevelID() {
        return user_id;
    }

    public void setUserlevelID(String user_id) {
        this.user_id = user_id;
    }

}
