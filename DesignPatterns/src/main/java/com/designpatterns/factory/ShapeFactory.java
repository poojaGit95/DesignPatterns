package com.designpatterns.factory;

public class ShapeFactory {

    Shape shape;

    public ShapeFactory(){

    }

    public Shape createShape(String shapeName){
        if (shapeName.equals("CIRCLE")){
            shape = new Circle();
        }else if(shapeName.equals("SQUARE")){
            shape = new Square();
        }
        return shape;
    }
}

