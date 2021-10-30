package com.himanshu.simple.designpattern.behavioural.mediator.collegue;


import com.himanshu.simple.designpattern.behavioural.mediator.mediator.Mediator;

public class JTPoorman extends Colleague {

    public JTPoorman(Mediator newMediator) {
        super(newMediator);

        System.out.println("JT Poorman signed up with the stockexchange\n");

    }
}