package com.training.designpatterns.decorator.shapes;

import com.training.designpatterns.decorator.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }
}
