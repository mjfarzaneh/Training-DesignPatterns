package com.training.designpatterns;

import com.training.designpatterns.factorypattern.ShapeFactory;
import com.training.designpatterns.factorypattern.enums.ShapeType;

public class PatternRunner {

    public static void main(String[] args) {
        ShapeFactory.getShape(ShapeType.RECTANGLE).draw();

        ShapeFactory.getShape(ShapeType.CIRCLE).draw();

        ShapeFactory.getShape(ShapeType.SQUARE).draw();
    }
}
