package com.designpatterns.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("square drawn");
    }

    @Override
    public double area(double size){
        return size*size;
    }
}
