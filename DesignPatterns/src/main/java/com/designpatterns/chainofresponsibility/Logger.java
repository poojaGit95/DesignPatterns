package com.designpatterns.chainofresponsibility;

public class Logger {

    LogBuilder loggerChain;

    public Logger(){
        buildLoggerChain();
    }

    public void buildLoggerChain(){
        loggerChain = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
    }

    public void log(String loglevel, String message){
        if (loggerChain!=null) {
            loggerChain.log(loglevel, message);
        }
    }
}
