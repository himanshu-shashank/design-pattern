package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
public class Command {
    String commandName;
    User user;
    List<String> params;

    public Command(String commandName, User user, List<String> params) {
        this.commandName = commandName;
        this.user = user;
        this.params = params;
    }

    public Command(String commandName, User user) {
        this.commandName = commandName;
        this.user = user;
    }
}
