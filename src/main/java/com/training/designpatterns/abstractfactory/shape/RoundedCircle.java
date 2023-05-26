package com.training.designpatterns.abstractfactory.shape;

public class RoundedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside of RoundedCircle");
    }
}
