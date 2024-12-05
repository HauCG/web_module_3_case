package com.example.webbb.service;

import com.example.webbb.model.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    List<Account> findAllAccounts() throws SQLException;
    int returnAccountIdIfRightCredentials(String Account_UserName, String Account_PassWord, String Account_Identity ) throws SQLException;
}


//List<Product> findAllProducts() throws SQLException;
//
//Product getProductById(int productId) throws SQLException;
//
//int getNextProductId() throws SQLException;
//
//void addProduct(Product product) throws SQLException;
//
//void updateProduct(Product product) throws SQLException;
//
//void deleteProduct(int productId) throws SQLException;
//
//List<Product> searchProducts(String keyword) throws SQLException;