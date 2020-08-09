package com.javagda34.dayone.dao;

import com.javagda34.dayone.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO implements IAccountDAO {

    List<Account>accountList;

    @Override
    public List<Account> getAccounts() {

        return accountList;
    }

    @Override
    public Account getAccountId(String id) {


        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getId().equals(id)){
                return accountList.get(i);
            }
        }
        Account account= new Account("1",1000L,"Dorota","Potulska");
        return account;
    }


}
