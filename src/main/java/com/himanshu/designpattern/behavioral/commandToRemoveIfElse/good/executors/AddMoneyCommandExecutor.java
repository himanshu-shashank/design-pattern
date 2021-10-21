package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors;

import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Command;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Database;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.RechargeProvider;

public class AddMoneyCommandExecutor extends CommandExecutor {
    RechargeProvider rechargeProvider;

    public AddMoneyCommandExecutor(Database database, RechargeProvider rechargeProvider) {
        super(database);
        this.rechargeProvider = rechargeProvider;
    }

    public Boolean isApplicable(Command command) {
        return command.getCommandName().equals("addBalance");
    }

    protected Boolean isValid(Command command) {
        return command.getParams().size() == 1;
    }

    protected String executeValidCommand(Command command) {
        Integer balanceToAdd = Integer.parseInt(command.getParams().get(0));

        Integer userBalance = database.getUsreBalance(command.getUser());

        rechargeProvider.addMoney(command.getUser().getAccount(), balanceToAdd);
        return "Recharge Done";

    }
}
