package com.designpatterns.observer;

public class MobileObserverImpl implements Observer{

    String phone;
    Subject iphoneSubject;

    public MobileObserverImpl(String phone, Subject iphoneSubject){
        this.phone = phone;
        this.iphoneSubject = iphoneSubject;
    }

    @Override
    public void update() {
        sendText();
    }

    public void sendText(){
        System.out.println("Text sent to: " + phone + " iphone available stock " + iphoneSubject.getStockData());
    }

}
