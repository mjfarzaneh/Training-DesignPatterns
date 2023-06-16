package com.training.designpatterns;

import com.training.designpatterns.composite.Circle;
import com.training.designpatterns.composite.CompoundShape;
import com.training.designpatterns.composite.Dot;
import com.training.designpatterns.composite.Shape;

public class PatternRunner {

    public static void main(String[] args) {
        Shape circle1 = new Circle(0, 0, 5);
        Shape circle2 = new Circle(5, 3, 10);
        Shape dot = new Dot(10,20);
        CompoundShape shapes = new CompoundShape();
        shapes.addChild(circle1);
        shapes.addChild(circle2);
        shapes.addChild(dot);

        shapes.draw();
        shapes.move(8,-9);
        shapes.draw();
    }
}
