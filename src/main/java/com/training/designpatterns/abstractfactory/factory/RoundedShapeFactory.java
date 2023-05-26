package com.training.designpatterns.abstractfactory.factory;

import com.training.designpatterns.abstractfactory.enums.ShapeType;
import com.training.designpatterns.abstractfactory.shape.RoundedCircle;
import com.training.designpatterns.abstractfactory.shape.RoundedRectangle;
import com.training.designpatterns.abstractfactory.shape.Shape;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType){
            case RECTANGLE:
                return new RoundedRectangle();
            case CIRCLE:
                return new RoundedCircle();
            default:
                throw new NotImplementedException();
        }
    }
}
