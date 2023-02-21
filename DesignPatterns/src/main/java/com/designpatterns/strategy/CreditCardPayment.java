package com.designpatterns.strategy;

public class CreditCardPayment implements Payment{

    String cardHolderName;
    String cardNumber;
    String validity;

    public CreditCardPayment(String cardHolderName, String cardNumber, String validity){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.validity = validity;
    }
    @Override
    public void makePayment() {
        System.out.println("Payment done using Credit card.");
    }
}
