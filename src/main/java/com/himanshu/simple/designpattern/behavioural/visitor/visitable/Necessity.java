package com.himanshu.simple.designpattern.behavioural.visitor.visitable;

import com.himanshu.simple.designpattern.behavioural.visitor.visitor.Visitor;

public class Necessity implements Visitable {

    private double price;

    public Necessity(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
