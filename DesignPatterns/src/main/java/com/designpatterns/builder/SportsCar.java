package com.designpatterns.builder;

public class SportsCar implements CarBuilder{

        Car car;

        public SportsCar(){
            this.car = new Car();
        }
        @Override
        public CarBuilder buildEngine() {
            car.setEngine("automatic");
            return this;
        }

        @Override
        public CarBuilder buildDoors() {
            car.setDoors("2");
            return this;
        }

        @Override
        public CarBuilder buildSeats() {
            car.setSeats("2");
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
