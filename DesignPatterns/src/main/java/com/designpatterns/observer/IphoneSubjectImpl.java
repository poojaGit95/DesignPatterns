package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneSubjectImpl implements Subject{

    private List<Observer> iphoneObservers;

    private int stockData;

    public IphoneSubjectImpl(){
        this.stockData = 0;
        this.iphoneObservers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        iphoneObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        iphoneObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: iphoneObservers) {
            o.update();
        }
    }

    public void setStockData(int newStock){
        if (stockData==0){
            notifyObservers();
        }
        stockData = newStock;
    }

    public int getStockData(){
        return stockData;
    }
}
