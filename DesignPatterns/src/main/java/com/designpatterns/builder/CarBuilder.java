package com.designpatterns.builder;

public interface CarBuilder {


    public CarBuilder buildEngine();

    public CarBuilder buildDoors();

    public CarBuilder buildSeats();

    public CarBuilder buildWheels();

    public Car buildCar();

}
