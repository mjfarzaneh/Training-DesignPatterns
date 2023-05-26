package com.training.designpatterns.factorypattern;

import com.training.designpatterns.factorypattern.enums.ShapeType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            default:
                throw new NotImplementedException();
        }
    }
}
