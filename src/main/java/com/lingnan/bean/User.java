package com.lingnan.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/28.
 */
public class User implements Serializable{


    private String userName;
    private String password;
    private Date regDate;
    private Boolean admin;


    public User() {
    }

    public User(String userName, String password, Date regDate, Boolean admin) {
        this.userName = userName;
        this.password = password;
        this.regDate = regDate;
        this.admin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
