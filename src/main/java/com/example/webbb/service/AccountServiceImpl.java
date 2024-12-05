package com.example.webbb.service;

import com.example.webbb.dao.AccountDao;
import com.example.webbb.dao.AccountDaoImpl;
import com.example.webbb.model.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService{
    private final AccountDao accountDao = new AccountDaoImpl();

    @Override
    public List<Account> findAllAccounts() throws SQLException {
        return accountDao.findAllAccounts();
    }

    @Override
    public int returnAccountIdIfRightCredentials(String Account_UserName, String Account_PassWord, String Account_Identity ) throws SQLException {
        return accountDao.checkRightCredentials(Account_UserName, Account_PassWord, Account_Identity);
    }
}
