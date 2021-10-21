package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors;

import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Command;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Database;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.RechargeProvider;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.User;

public class RechargeCommandExecutor extends CommandExecutor {
    RechargeProvider rechargeProvider;

    public RechargeCommandExecutor(Database database, RechargeProvider rechargeProvider) {
        super(database);
        this.rechargeProvider = rechargeProvider;
    }

    public Boolean isApplicable(Command command) {
        return command.getCommandName().equals("recharge");
    }

    protected Boolean isValid(Command command) {
        return command.getParams().size() == 1;
    }

    protected String executeValidCommand(Command command) {
        Integer rechargeAmount = Integer.parseInt(command.getParams().get(0));
        System.out.println(rechargeAmount);
        Integer userBalance = database.getUsreBalance(command.getUser());
        if (userBalance < rechargeAmount) {
            return "Not sufficient balance";
        }
        rechargeProvider.recharge(command.getUser().getAccount(), rechargeAmount);
        return "Recharge Done";

    }
}
