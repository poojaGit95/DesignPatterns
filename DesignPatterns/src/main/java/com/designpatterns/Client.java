package com.designpatterns;

import com.designpatterns.abstractfactory.Animal;
import com.designpatterns.abstractfactory.AnimalFactory;
import com.designpatterns.adapter.AdapterSocket;
import com.designpatterns.adapter.AdapterSocketImpl;
import com.designpatterns.adapter.Socket;
import com.designpatterns.adapter.Volt;
import com.designpatterns.builder.Car;
import com.designpatterns.builder.CarBuilder;
import com.designpatterns.builder.Director;
import com.designpatterns.builder.ManualCar;
import com.designpatterns.factory.Shape;
import com.designpatterns.factory.ShapeFactory;
import com.designpatterns.observer.*;
import com.designpatterns.singleton.Singleton;
import com.designpatterns.strategy.CreditCardPayment;
import com.designpatterns.strategy.ShoppingCart;

public class Client {

    public static void main(String[] args){

        //Singleton design patterns
        Singleton sig = Singleton.getInstance();
        System.out.println(sig.toString());

        System.out.println("******************************************************");


        //Adapter design pattern
        Socket s = new Socket();
        AdapterSocket as = new AdapterSocketImpl();
        Volt mobileCharging = as.get3Volts(s);
        Volt batteryCharging = as.get12Volts(s);
        Volt pumpCharging = as.get120Volts(s);
        System.out.println(mobileCharging + " " + batteryCharging + " "+ pumpCharging);

        System.out.println("******************************************************");


        //Strategy design pattern
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItems("milk");
        shoppingCart.addItems("bread");
        shoppingCart.removeItems("bread");
        shoppingCart.makePayment(new CreditCardPayment("Pooja", "123456789", "02/24"));

        System.out.println("******************************************************");


        //Builder design pattern
        CarBuilder carBuilder = new ManualCar();
        Director director = new Director(carBuilder);
        Car car = director.constructCar();
        System.out.println(car);

        System.out.println("******************************************************");


        //Observer design pattern
        Subject iphoneStock = new IphoneSubjectImpl();
        Observer emailObserver1 = new EmailObserverImpl("xyz@gmail.com", iphoneStock);
        Observer emailObserver2 = new EmailObserverImpl("abc@gmail.com", iphoneStock);
        Observer mobileObserver1 = new MobileObserverImpl("12345", iphoneStock);
        Observer mobileObserver2 = new MobileObserverImpl("67896", iphoneStock);

        iphoneStock.addObserver(emailObserver1);
        iphoneStock.addObserver(mobileObserver1);
        iphoneStock.addObserver(emailObserver2);
        iphoneStock.addObserver(mobileObserver2);

        iphoneStock.setStockData(10);
        iphoneStock.setStockData(0);
        iphoneStock.setStockData(10);

        System.out.println("******************************************************");

        //Factory design pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();
        System.out.println(circle.area(4));

        System.out.println("******************************************************");

        //Abstract Factory design pattern
        AnimalFactory factory = new AnimalFactory();
        Animal animal1 = factory.createFactory("DOMESTIC").createAnimal("COW");
        animal1.eat();
        animal1.makeSound();
        Animal animal2 = factory.createFactory("WILD").createAnimal("LION");
        animal2.makeSound();
        animal2.eat();






    }

}
