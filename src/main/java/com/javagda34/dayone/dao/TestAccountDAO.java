package com.javagda34.dayone.dao;

import com.javagda34.dayone.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestAccountDAO implements IAccountDAO{

    List<Account>accountList;

    public TestAccountDAO(List<Account> accountList) {
        this.accountList = accountList;
    }


    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public Account getAccountId(String id) {
        return null;
    }
}
