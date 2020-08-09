package com.javagda34.dayone.service;

import com.javagda34.dayone.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditService implements ICreditService {


    private AccountDAO accountDAO;

    @Autowired
    public CreditService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void takeCredit(String accountId, Long amount) {

        accountDAO.getAccountId(accountId);
        System.out.println("takeCredit, ok");
    }

    public void takeLimit(String accountId, Long amount) {
        System.out.println("takeLimit, ok");
    }
}
