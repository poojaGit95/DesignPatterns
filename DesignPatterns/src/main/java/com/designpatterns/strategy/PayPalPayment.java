package com.designpatterns.strategy;

public class PayPalPayment implements Payment{

    String accountHolderName;
    String accountNumber;


    public PayPalPayment(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment done using PayPal.");
    }
}
