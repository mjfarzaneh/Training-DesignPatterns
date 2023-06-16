package com.training.designpatterns;

import com.training.designpatterns.decorator.decoratorimplements.BorderColorDecorator;
import com.training.designpatterns.decorator.decoratorimplements.BorderStyleDecorator;
import com.training.designpatterns.decorator.decoratorimplements.BorderThicknessDecorator;
import com.training.designpatterns.decorator.decoratorimplements.FillColorDecorator;
import com.training.designpatterns.decorator.enums.Color;
import com.training.designpatterns.decorator.enums.LineStyle;
import com.training.designpatterns.decorator.shapes.Circle;
import com.training.designpatterns.decorator.shapes.Rectangle;
import com.training.designpatterns.decorator.Shape;

public class PatternRunner {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape circle2 = new FillColorDecorator(
                new BorderColorDecorator(
                        new BorderStyleDecorator(
                                new BorderThicknessDecorator(
                                        new Circle()
                                        , 5.0f
                                )
                                , LineStyle.SOLID
                        )
                        , Color.BLUE
                )
                , Color.RED
        );
        circle2.draw();
    }
}
