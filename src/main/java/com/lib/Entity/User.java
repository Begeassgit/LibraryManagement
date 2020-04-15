package com.lib.Entity;
/*
* 读者实体类
* */
public class User {
    private String ReaderNo;
    private String ReaderName;
    private short Age;
    private String Sex;
    private String Number;
    private String Identities;
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getReaderNo() {
        return ReaderNo;
    }

    public void setReaderNo(String readerNo) {
        ReaderNo = readerNo;
    }

    public String getReaderName() {
        return ReaderName;
    }

    public void setReaderName(String readerName) {
        ReaderName = readerName;
    }

    public short getAge() {
        return Age;
    }

    public void setAge(short age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getIdentities() {
        return Identities;
    }

    public void setIdentities(String identities) {
        Identities = identities;
    }
}
