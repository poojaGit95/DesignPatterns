package com.designpatterns.chainofresponsibility;

public class DebugLogger extends LogBuilder {

    public DebugLogger(LogBuilder nextLogger) {
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if (loglevel.equals("DEBUG")){
            System.out.println(message + " logged as: " + loglevel);
        }else{
            nextLogger.log(loglevel, message);
        }
    }
}
