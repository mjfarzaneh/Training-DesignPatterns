package com.training.designpatterns.abstractfactory.factory;

import com.training.designpatterns.abstractfactory.enums.ShapeType;
import com.training.designpatterns.abstractfactory.shape.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
