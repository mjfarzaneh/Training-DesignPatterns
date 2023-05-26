package com.training.designpatterns.abstractfactory.shape;

public class RoundedRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside of RoundedRectangle");
    }
}
