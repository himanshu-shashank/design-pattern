package com.himanshu.simple.designpattern.chainofresponsibility.chain;

import com.himanshu.simple.designpattern.chainofresponsibility.numbers.Numbers;

public class DivideNumbers implements Chain{

    private  Chain nextInChain;

    @Override
    public Chain setNextChain(Chain nextChain) {

        nextInChain = nextChain;

        return nextChain;
    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "div"){

            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
                    (request.getNumber1()/request.getNumber2()));

        } else {

            System.out.print("Only works for add, sub, mult, and div");

        }
    }
}