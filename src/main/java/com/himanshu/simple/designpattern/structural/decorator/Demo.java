package com.himanshu.simple.designpattern.structural.decorator;

import com.himanshu.simple.designpattern.structural.decorator.pizza.Mozzarella;
import com.himanshu.simple.designpattern.structural.decorator.pizza.Pizza;
import com.himanshu.simple.designpattern.structural.decorator.pizza.PlainPizza;
import com.himanshu.simple.designpattern.structural.decorator.pizza.TomatoSauce;

public class Demo {
    public static void main(String[] args){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new Mozzarella(new PlainPizza())));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }
}
