package com.javagda34.dayone.service;

import org.springframework.stereotype.Component;


public interface ITransferService {
//wpłacać
    void deposit(String accountId, Long amount);
//wypłacać
    void withdraw(String accountId, Long amount);
//przelać
    void transfer(String accountId, Long amount);
}
