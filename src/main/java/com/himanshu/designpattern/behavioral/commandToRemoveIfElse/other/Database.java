package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<Integer, User> db = new HashMap<>();

    public Integer getUsreBalance(User user) {
        return user.getAccount().getBalance();
    }

    public void regiterUser(User user){
        if(!db.containsKey(user.getId()))
            this.db.put(user.getId(), user);
    }

}
