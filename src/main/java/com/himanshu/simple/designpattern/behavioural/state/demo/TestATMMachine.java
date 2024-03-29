package com.himanshu.simple.designpattern.behavioural.state.demo;

import com.himanshu.simple.designpattern.behavioural.state.ATMMachine;

public class TestATMMachine {
    public static void main(String[] args){

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

    }
}
