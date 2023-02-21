package com.designpatterns.adapter;

public interface AdapterSocket {

    public Volt get3Volts(Socket s);

    public Volt get12Volts(Socket s);

    public Volt get120Volts(Socket s);

}
