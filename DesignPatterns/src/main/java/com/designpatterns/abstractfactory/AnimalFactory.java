package com.designpatterns.abstractfactory;

public class AnimalFactory {

    AnimalAbstractFactory animalAbstractFactory;

    public AnimalFactory(){

    }

    public AnimalAbstractFactory createFactory(String factoryName){
        if (factoryName.equals("DOMESTIC")){
            animalAbstractFactory = new DomesticAnimalFactory();
        }else if (factoryName.equals("WILD")){
            animalAbstractFactory = new WildAnimalFactory();
        }
        return animalAbstractFactory;
    }
}
