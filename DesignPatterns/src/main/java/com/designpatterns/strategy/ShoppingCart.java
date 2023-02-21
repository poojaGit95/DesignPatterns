package com.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<String> items;
    public ShoppingCart(){
        this.items = new ArrayList<String>();
    }

    public void addItems(String item){
        items.add(item);
    }

    public void removeItems(String item){
        items.remove(item);
    }

    public void makePayment(Payment payment){
        payment.makePayment();
    }
}
