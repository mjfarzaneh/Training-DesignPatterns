package com.training.designpatterns.abstractfactory.shape;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside of Rectangle");
    }
}
