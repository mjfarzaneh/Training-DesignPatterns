package com.training.designpatterns.factorypattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square: draw()");
    }
}
