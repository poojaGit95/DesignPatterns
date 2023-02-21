package com.designpatterns.adapter;

public class Socket {

   private Volt volt;

    public Socket(){
        this.volt = new Volt(120);
    }

    public Volt getSocketVolt(){
        return volt;
    }


}
