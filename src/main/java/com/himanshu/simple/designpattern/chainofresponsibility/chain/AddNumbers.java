package com.himanshu.simple.designpattern.chainofresponsibility.chain;

import com.himanshu.simple.designpattern.chainofresponsibility.numbers.Numbers;

public class AddNumbers implements Chain{

    private  Chain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it

    public Chain setNextChain(Chain nextChain) {

        this.nextInChain = nextChain;

        return nextChain;
    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()

    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }
}
