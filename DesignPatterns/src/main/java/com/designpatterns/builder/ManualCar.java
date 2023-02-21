package com.designpatterns.builder;

public class ManualCar implements CarBuilder {

    Car car;

    public ManualCar(){
        this.car = new Car();
    }
    @Override
    public CarBuilder buildEngine() {
        car.setEngine("manual");
        return this;
    }

    @Override
    public CarBuilder buildDoors() {
        car.setDoors("4");
        return this;
    }

    @Override
    public CarBuilder buildSeats() {
        car.setSeats("4");
        return this;
    }

    @Override
    public CarBuilder buildWheels() {
        car.setWheels("4");
        return this;
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
