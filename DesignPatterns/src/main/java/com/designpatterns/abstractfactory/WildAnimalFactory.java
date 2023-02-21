package com.designpatterns.abstractfactory;

public class WildAnimalFactory implements AnimalAbstractFactory {

    Animal animal;

    public WildAnimalFactory(){

    }

    public Animal createAnimal(String animalName) {
        if (animalName.equals("LION")){
            animal = new Lion();
        }else if (animalName.equals("ELEPHANT")){
            animal = new Elephant();
        }
        return animal;
    }
}
