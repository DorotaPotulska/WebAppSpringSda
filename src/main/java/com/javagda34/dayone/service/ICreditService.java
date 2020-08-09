package com.javagda34.dayone.service;

import org.springframework.stereotype.Component;


public interface ICreditService {

        void takeCredit(String accountId, Long amount);
        void takeLimit(String accountId, Long amount);
}
