package com.designpatterns.factory;

public class Circle implements Shape{

    private static final double PI = 3.14;
    @Override
    public void draw() {
        System.out.println("circle drawn");
    }

    public double area(double size){
        return PI*size*size;
    }

}
