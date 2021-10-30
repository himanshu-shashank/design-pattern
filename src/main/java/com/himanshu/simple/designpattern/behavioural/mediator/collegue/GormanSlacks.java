package com.himanshu.simple.designpattern.behavioural.mediator.collegue;


import com.himanshu.simple.designpattern.behavioural.mediator.mediator.Mediator;

public class GormanSlacks extends Colleague{

    public GormanSlacks(Mediator newMediator) {
        super(newMediator);

        System.out.println("Gorman Slacks signed up with the stockexchange\n");

    }

}