package com.training.designpatterns.decorator.decoratorimplements;

import com.training.designpatterns.decorator.Shape;
import com.training.designpatterns.decorator.ShapeDecorator;
import com.training.designpatterns.decorator.enums.Color;

public class FillColorDecorator extends ShapeDecorator {
    private Color color;

    public FillColorDecorator(Shape decoratedShape
            , Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Draw Color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
