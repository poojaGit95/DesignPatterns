package com.designpatterns.abstractfactory;

public class DomesticAnimalFactory implements AnimalAbstractFactory {

    Animal animal;

    public DomesticAnimalFactory(){

    }

    @Override
    public Animal createAnimal(String animalName) {
        if (animalName.equals("COW")){
            animal = new Cow();
        }else if (animalName.equals("SHEEP")){
            animal = new Sheep();
        }
        return animal;
    }


}
