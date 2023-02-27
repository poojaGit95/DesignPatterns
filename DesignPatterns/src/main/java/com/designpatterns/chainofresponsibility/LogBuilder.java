package com.designpatterns.chainofresponsibility;

public abstract class LogBuilder {
    LogBuilder nextLogger;

    public LogBuilder(LogBuilder nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(String loglevel, String message){
        if (nextLogger!=null) {
            nextLogger.log(loglevel, message);
        }else{
            System.out.println("This log level does not exist");
        }
    }
}
