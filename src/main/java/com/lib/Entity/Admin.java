package com.lib.Entity;
/*
    Author:Yin
*/
public class Admin {
    private String UserNo;
    private String UserName;
    private String Password;
    private short Authority;

    public String getUserNo() {
        return UserNo;
    }

    public void setUserNo(String userNo) {
        UserNo = userNo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public short getAuthority() {
        return Authority;
    }

    public void setAuthority(short authority) {
        Authority = authority;
    }
}
