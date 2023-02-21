package com.designpatterns.abstractfactory;

public class Lion implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Roaring sound");
    }

    @Override
    public void eat() {
        System.out.println("Eats Flesh");
    }
}
