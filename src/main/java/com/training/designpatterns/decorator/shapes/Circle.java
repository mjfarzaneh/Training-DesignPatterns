package com.training.designpatterns.decorator.shapes;

import com.training.designpatterns.decorator.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
}
