package com.training.designpatterns.abstractfactory.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside of Circle");
    }
}
