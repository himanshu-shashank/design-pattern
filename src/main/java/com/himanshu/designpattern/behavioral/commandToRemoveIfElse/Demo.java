package com.himanshu.designpattern.behavioral.commandToRemoveIfElse;

import com.google.common.collect.ImmutableList;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.CommandRunnerGood;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors.AddMoneyCommandExecutor;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors.BalanceCommandExecutor;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors.CommandExecutor;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors.RechargeCommandExecutor;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.*;

import java.util.UUID;

public class Demo {
    public static void main(String[] args) {
        Database database = new Database();
        User u1 = new User(1, "Himanshu", new Account(UUID.randomUUID(), 1000));
        database.regiterUser(u1);
        User u2 = new User(1, "Snigdha", new Account(UUID.randomUUID(),2000));
        database.regiterUser(u2);
        ImmutableList<CommandExecutor> commandExecutors = ImmutableList.of(
                new BalanceCommandExecutor(database),
                new RechargeCommandExecutor(database, new RechargeProvider()),
                new AddMoneyCommandExecutor(database, new RechargeProvider()));

        CommandRunnerGood commandRunnerGood = new CommandRunnerGood(commandExecutors);

        String output = commandRunnerGood.runCommand(new Command("recharge", u1, ImmutableList.of("10")));
        System.out.println(output);
        String balance = commandRunnerGood.runCommand(new Command("balance", u1));
        String money = commandRunnerGood.runCommand(new Command("addBalance", u1, ImmutableList.of("100")));
        String balances = commandRunnerGood.runCommand(new Command("balance", u1));
        System.out.println(balances);
        System.out.println(u1.getAccount().getBalance());
        System.out.println(u2.getAccount().getBalance());
    }
}
