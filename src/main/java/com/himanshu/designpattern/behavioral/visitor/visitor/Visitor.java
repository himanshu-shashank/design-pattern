package com.himanshu.designpattern.behavioral.visitor.visitor;

import com.himanshu.designpattern.behavioral.visitor.shapes.Circle;
import com.himanshu.designpattern.behavioral.visitor.shapes.CompoundShape;
import com.himanshu.designpattern.behavioral.visitor.shapes.Dot;
import com.himanshu.designpattern.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
