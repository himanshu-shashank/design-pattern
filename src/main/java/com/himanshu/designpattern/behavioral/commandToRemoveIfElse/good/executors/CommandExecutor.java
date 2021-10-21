package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.good.executors;

import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Command;
import com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other.Database;

abstract public class CommandExecutor {

    protected Database database;

    public CommandExecutor(Database database) {
        this.database = database;
    }

    public String execute(final Command command) {
        if (!isValid(command)) {
            return "Invalid Command";
        }
        return executeValidCommand(command);
    }

    public abstract Boolean isApplicable(final Command command);

    protected abstract Boolean isValid(final Command command);

    protected abstract String executeValidCommand(final Command command);
}
