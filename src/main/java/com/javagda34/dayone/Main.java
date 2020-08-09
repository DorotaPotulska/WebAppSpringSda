package com.javagda34.dayone;


import com.javagda34.dayone.config.AppConfigiguration;
import com.javagda34.dayone.dao.AccountDAO;
import com.javagda34.dayone.service.CreditService;
import com.javagda34.dayone.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext kontener = new AnnotationConfigApplicationContext(AppConfigiguration.class);

        System.out.println(kontener);

        /*CreditService creditService =(CreditService) kontener.getBean("creditService");
        TransferService transferService = (TransferService) kontener.getBean("transferService"); //z małej litery ""
        */

        TransferService transferService1=kontener.getBean(TransferService.class);
        TransferService transferService2=kontener.getBean(TransferService.class);
        TransferService transferService3=kontener.getBean(TransferService.class);
        TransferService transferService4=kontener.getBean(TransferService.class);
        TransferService transferService5=kontener.getBean(TransferService.class);
        TransferService transferService=kontener.getBean(TransferService.class);
        transferService.withdraw("afsdfa",6000L);
        System.out.println(TransferService.counter);


    }


}
