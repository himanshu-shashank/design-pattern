package com.himanshu.designpattern.behavioral.commandToRemoveIfElse.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    Account account;
}
