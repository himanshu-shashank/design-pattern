package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors;


import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Command;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Database;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.User;

public class BalanceCommandExecutor extends CommandExecutor {

    public static final String BALANCE = "balance";

    public BalanceCommandExecutor(Database database) {
        super(database);
    }

    public Boolean isApplicable(Command command) {
        return command.getCommandName().equals(BALANCE);
    }

    protected Boolean isValid(Command command) {
        return command.getParams() == null;
    }

    protected String executeValidCommand(Command command) {
        User user = command.getUser();
        return database.getUsreBalance(user).toString();
    }
}
