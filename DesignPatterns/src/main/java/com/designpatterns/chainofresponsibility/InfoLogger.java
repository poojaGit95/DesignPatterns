package com.designpatterns.chainofresponsibility;

public class InfoLogger extends LogBuilder {

    public InfoLogger(LogBuilder nextLogger){
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if (loglevel.equals("INFO")){
            System.out.println(message + " logged as: " + loglevel);
        }else{
            nextLogger.log(loglevel, message);
        }
    }
}
