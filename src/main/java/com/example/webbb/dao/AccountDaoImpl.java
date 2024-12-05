package com.example.webbb.dao;

import com.example.webbb.connection.DatabaseConnection;
import com.example.webbb.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private final DatabaseConnection dbConnection = new DatabaseConnection();

    @Override
    public List<Account> findAllAccounts() throws SQLException {
        List<Account> accounts = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("");
        ResultSet rs = statement.executeQuery();


        while (rs.next()) {
            Account account = new Account(
                    rs.getInt("Account_Id"),
                    rs.getString("Account_UserName"),
                    rs.getString("Account_PassWord"),
                    rs.getString("Account_Identity")
            );
            accounts.add(account);
        }
        return accounts;
    }


    @Override
    public int checkRightCredentials(String Account_UserName, String Account_PassWord, String Account_Identity ) {
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM Account WHERE Account_UserName = ? AND Account_PassWord = ? AND Account_Identity = ?")) {

            statement.setString(1, Account_UserName);
            statement.setString(2, Account_PassWord);
            statement.setString(3, Account_Identity);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("Account_Id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }


}
