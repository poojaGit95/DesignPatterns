package com.designpatterns.adapter;

public class AdapterSocketImpl implements AdapterSocket{
    @Override
    public Volt get3Volts(Socket s) {
        Volt v = convertXVoltsToY(s.getSocketVolt(), 40);
        return v;
    }

    @Override
    public Volt get12Volts(Socket s) {
        Volt v = convertXVoltsToY(s.getSocketVolt(), 40);
        return v;
    }

    @Override
    public Volt get120Volts(Socket s) {
        return s.getSocketVolt();
    }

    private Volt convertXVoltsToY(Volt v, int i){
        return new Volt(v.getVolt()/i);
    }
}
