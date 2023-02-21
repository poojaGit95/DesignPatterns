package com.designpatterns.adapter;

public class Volt {

    private int volt;

    public Volt(int volt){
        this.volt = volt;
    }

    public void setVolt(int v){
        this.volt = v;
    }

    public int getVolt(){
        return  volt;
    }

    public String toString(){
        return String.valueOf(volt);
    }
}
