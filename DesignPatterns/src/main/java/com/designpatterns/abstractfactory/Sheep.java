package com.designpatterns.abstractfactory;

public class Sheep implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Bhaaw sound");
    }

    @Override
    public void eat() {
        System.out.println("Eats grass");
    }
}
