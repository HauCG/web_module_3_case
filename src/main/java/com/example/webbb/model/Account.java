package com.example.webbb.model;

public class Account {
    int Account_Id;
    String Account_UserName;
    String Account_PassWord;
    String Account_Identity;

    public Account(int accountId, String accountUserName, String accountPassWord, String accountIdentity) {
        this.Account_Id = accountId;
        this.Account_UserName = accountUserName;
        this.Account_PassWord = accountPassWord;
        this.Account_Identity = accountIdentity;
    }

    public int getAccount_Id() {
        return Account_Id;
    }

    public void setAccount_Id(int account_Id) {
        Account_Id = account_Id;
    }

    public String getAccount_UserName() {
        return Account_UserName;
    }

    public void setAccount_UserName(String account_UserName) {
        Account_UserName = account_UserName;
    }

    public String getAccount_PassWord() {
        return Account_PassWord;
    }

    public void setAccount_PassWord(String account_PassWord) {
        Account_PassWord = account_PassWord;
    }

    public String getAccount_Identity() {
        return Account_Identity;
    }

    public void setAccount_Identity(String account_Identity) {
        Account_Identity = account_Identity;
    }
}
