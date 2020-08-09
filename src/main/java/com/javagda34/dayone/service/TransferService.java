package com.javagda34.dayone.service;

import com.javagda34.dayone.dao.AccountDAO;
import com.javagda34.dayone.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TransferService implements ITransferService {

    private AccountDAO accountDAO;
    public static int counter=0;


    @Autowired
    public TransferService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
        counter++;
    }

    public void deposit(String accountId, Long amount) {

      /*  Account account = accountDAO.getAccountId(accountId);

        Long newSaldo = account.getSaldo()+amount;

        account.setSaldo(newSaldo);*/

        System.out.println("Deposit Ok!" );
    }


    public void withdraw(String accountId, Long amount) {
     /*   Account account = accountDAO.getAccountId(accountId);

        if(account.getSaldo()>=amount) {
            Long newSaldo = account.getSaldo() - amount;

            account.setSaldo(newSaldo);
        }else{
            System.out.println("Saldo is too low:" +account.getSaldo());
        }*/

        System.out.println("Withdraw Ok!");
    }


    public void transfer(String accountId, Long amount) {


        System.out.println("Transfer Ok!");
    }
}
