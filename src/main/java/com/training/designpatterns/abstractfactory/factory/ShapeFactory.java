package com.training.designpatterns.abstractfactory.factory;

import com.training.designpatterns.abstractfactory.enums.ShapeType;
import com.training.designpatterns.abstractfactory.shape.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(ShapeType shapeType) {

        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new NotImplementedException();
        }
    }
}
