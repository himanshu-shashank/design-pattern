package com.himanshu.simple.designpattern.behavioural.visitor.visitor;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types

import com.himanshu.simple.designpattern.behavioural.visitor.visitable.Liquor;
import com.himanshu.simple.designpattern.behavioural.visitor.visitable.Necessity;
import com.himanshu.simple.designpattern.behavioural.visitor.visitable.Tobacco;

public interface Visitor {

    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading

    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);

}