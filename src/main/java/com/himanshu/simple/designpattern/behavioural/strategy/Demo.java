package com.himanshu.simple.designpattern.behavioural.strategy;

import com.himanshu.simple.designpattern.behavioural.strategy.Animals.Animal;
import com.himanshu.simple.designpattern.behavioural.strategy.Animals.Bird;
import com.himanshu.simple.designpattern.behavioural.strategy.Animals.Dog;
import com.himanshu.simple.designpattern.behavioural.strategy.strategies.ItFlys;

public class Demo {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }
}
