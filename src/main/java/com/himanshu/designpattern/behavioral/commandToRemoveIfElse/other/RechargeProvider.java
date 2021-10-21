package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other;

public class RechargeProvider {

    public void recharge(Account account, Integer rechargeAmount) {
        account.setBalance(account.getBalance() - rechargeAmount);

    }

    public void addMoney(Account account, Integer balanceToAdd) {
        account.setBalance(account.getBalance() + balanceToAdd);
    }
}
