package com.designpatterns.observer;

public class EmailObserverImpl implements Observer{

    String email;
    Subject iphoneSubject;

    public EmailObserverImpl(String email, Subject iphoneSubject){
        this.email = email;
        this.iphoneSubject = iphoneSubject;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Email sent to: " + email + " iphone available stock " + iphoneSubject.getStockData());
    }
}
