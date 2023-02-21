package com.designpatterns.builder;

public class Car {

    private String engine;
    private String doors;
    private String seats;
    private String wheels;

    public Car(){
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }



    public String toString(){
        return "Car is built with " + engine + " engine, with " + wheels + " wheels, with " + doors + " doors, " +
            "and with " + seats + " seats.";
    }
}
