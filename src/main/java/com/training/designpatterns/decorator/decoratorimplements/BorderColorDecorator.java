package com.training.designpatterns.decorator.decoratorimplements;

import com.training.designpatterns.decorator.Shape;
import com.training.designpatterns.decorator.ShapeDecorator;
import com.training.designpatterns.decorator.enums.Color;

public class BorderColorDecorator extends ShapeDecorator {

    private Color color;

    public BorderColorDecorator(Shape decoratedShape
            , Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
