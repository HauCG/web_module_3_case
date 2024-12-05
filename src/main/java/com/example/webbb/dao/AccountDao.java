package com.example.webbb.dao;

import com.example.webbb.model.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    List<Account> findAllAccounts() throws SQLException;
    int checkRightCredentials(String Account_UserName, String Account_PassWord,String Account_Identity );
}
