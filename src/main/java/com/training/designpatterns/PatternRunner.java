package com.training.designpatterns;

import com.training.designpatterns.abstractfactory.enums.ShapeType;
import com.training.designpatterns.abstractfactory.factory.AbstractShapeFactory;
import com.training.designpatterns.abstractfactory.factory.ShapeFactoryProducer;

public class PatternRunner {
    public static void main(String[] args) {
        ShapeFactoryProducer shapeFactoryProducer = new ShapeFactoryProducer();
        AbstractShapeFactory roundedFactory = shapeFactoryProducer.getFactory(true);

        roundedFactory.getShape(ShapeType.RECTANGLE).draw();
        roundedFactory.getShape(ShapeType.CIRCLE).draw();

        AbstractShapeFactory shapeFactory = shapeFactoryProducer.getFactory(false);
        shapeFactory.getShape(ShapeType.RECTANGLE).draw();
        shapeFactory.getShape(ShapeType.CIRCLE).draw();
    }
}
