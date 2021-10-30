package com.himanshu.simple.designpattern.chainofresponsibility;

import com.himanshu.simple.designpattern.chainofresponsibility.chain.*;
import com.himanshu.simple.designpattern.chainofresponsibility.numbers.Numbers;

public class Demo {
    public static void main(String[] args){

        // Here I define all of the objects in the chain

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        Chain chain = new AddNumbers().setNextChain(new SubtractNumbers().setNextChain(new MultNumbers().setNextChain(new DivideNumbers())));

        // Here I tell each object where to forward the
        // data if it can't process the request

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        Numbers request = new Numbers(4,2,"div");

        chain.calculate(request);

    }
}
