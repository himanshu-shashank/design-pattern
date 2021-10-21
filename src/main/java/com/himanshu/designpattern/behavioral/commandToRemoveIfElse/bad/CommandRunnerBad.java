package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.bad;


import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Command;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Database;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.RechargeProvider;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.User;

public class CommandRunnerBad {
    final Database database;
    final RechargeProvider rechargeProvider;

    public CommandRunnerBad(Database database, RechargeProvider rechargeProvider) {
        this.database = database;
        this.rechargeProvider = rechargeProvider;
    }

    String runCommand(Command command) {
        if ("balance".equals(command.getCommandName())) {
            if (command.getParams().size() != 1) {
                return "Invalid Command";
            }
            User user = command.getUser();
            return database.getUsreBalance(user).toString();
        } else if ("recharge".equals(command.getCommandName())) {
            if (command.getParams().size() != 2) {
                return "Invalid Command";
            }
            User user = command.getUser();
            Integer rechargeAmount = Integer.parseInt(command.getParams().get(1));

            Integer userBalance = database.getUsreBalance(user);
            if (userBalance < rechargeAmount) {
                return "Not sufficient balance";
            }
            rechargeProvider.recharge(user.getAccount(), rechargeAmount);
            return "Recharge Done";
        } else {
            return "Invalid command";
        }
    }
}
