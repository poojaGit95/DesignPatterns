package com.designpatterns.abstractfactory;

public class Cow implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Moow sound");
    }

    @Override
    public void eat() {
        System.out.println("Eats grass");
    }
}
