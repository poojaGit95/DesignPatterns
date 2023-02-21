package com.designpatterns.singleton;

public class Singleton {

    private static Singleton s = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return s;
    }

    public String toString(){
        return "Got instance of singleton class";
    }
}


