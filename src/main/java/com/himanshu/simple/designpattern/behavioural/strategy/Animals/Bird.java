package com.himanshu.simple.designpattern.behavioural.strategy.Animals;

import com.himanshu.simple.designpattern.behavioural.strategy.strategies.ItFlys;

public class Bird extends Animal {
    // The constructor initializes all objects

    public Bird(){

        super();

        setSound("Tweet");

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal

        flyingType = new ItFlys();

    }
}
