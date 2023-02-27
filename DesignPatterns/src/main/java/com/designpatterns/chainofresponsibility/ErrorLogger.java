package com.designpatterns.chainofresponsibility;

public class ErrorLogger extends LogBuilder {

    public ErrorLogger(LogBuilder nextLogger) {
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if (loglevel.equals("ERROR")){
            System.out.println(message + " logged as: " + loglevel);
        }else{
            if (nextLogger!=null)
                nextLogger.log(loglevel, message);
            else
                super.log(loglevel, message);
        }
    }
}
