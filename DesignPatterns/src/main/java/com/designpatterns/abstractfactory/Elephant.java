package com.designpatterns.abstractfactory;

public class Elephant implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Trumping sound");
    }

    @Override
    public void eat() {
        System.out.println("Eats long grass and leaves");
    }
}
