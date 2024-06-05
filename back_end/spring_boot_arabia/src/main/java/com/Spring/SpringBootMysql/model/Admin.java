package com.Spring.SpringBootMysql.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
    @NotBlank
    private String phone_no;
    @NotBlank
    private String user_id;

    public Long getAdminID() {
        return admin_id;
    }

    public void setAdminID(Long admin_id) {
        this.admin_id = admin_id;
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

    public String getUserlevelID() {
        return user_id;
    }

    public void setUserlevelID(String user_id) {
        this.user_id = user_id;
    }

}
