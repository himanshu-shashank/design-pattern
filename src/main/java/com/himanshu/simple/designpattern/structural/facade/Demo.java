package com.himanshu.simple.designpattern.structural.facade;

import com.himanshu.simple.designpattern.structural.facade.facade.BankAccountFacade;

public class Demo {
    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

        accessingBank.depositCash(12.00);

    }
}
