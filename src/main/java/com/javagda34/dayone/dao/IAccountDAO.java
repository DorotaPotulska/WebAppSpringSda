package com.javagda34.dayone.dao;

import com.javagda34.dayone.model.Account;

import java.util.List;

public interface IAccountDAO {

    List<Account> getAccounts();
    Account getAccountId(String id);
}
