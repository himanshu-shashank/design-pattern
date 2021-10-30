package com.himanshu.simple.designpattern.chainofresponsibility.chain;

import com.himanshu.simple.designpattern.chainofresponsibility.numbers.Numbers;

public class MultNumbers implements Chain{

    private  Chain nextInChain;

    @Override
    public Chain setNextChain(Chain nextChain) {

        nextInChain = nextChain;

        return nextChain;
    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "mult"){

            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
                    (request.getNumber1()*request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }



}