package com.himanshu.designpattern.behavioral.visitor.shapes;

import com.himanshu.designpattern.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
