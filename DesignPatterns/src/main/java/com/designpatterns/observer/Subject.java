package com.designpatterns.observer;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

    public void setStockData(int newStockData);

    public int getStockData();
}
