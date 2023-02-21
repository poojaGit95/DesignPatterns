package com.designpatterns.builder;

public class Director {

    CarBuilder carBuilder;

    public Director(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car constructCar(){
        Car car = carBuilder.buildEngine().buildSeats().buildWheels().buildDoors().buildCar();
        return car;
    }
}
