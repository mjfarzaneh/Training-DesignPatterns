package com.training.designpatterns.decorator.decoratorimplements;

import com.training.designpatterns.decorator.Shape;
import com.training.designpatterns.decorator.ShapeDecorator;
import com.training.designpatterns.decorator.enums.LineStyle;

public class BorderStyleDecorator extends ShapeDecorator {
    private LineStyle borderStyle;

    public BorderStyleDecorator(Shape decoratedShape
            , LineStyle borderStyle) {
        super(decoratedShape);
        this.borderStyle = borderStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border style: " + borderStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
