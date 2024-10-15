/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.stockmarket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa21-bse-011
 */
public class Stock {
     private List<Observer> observers;
    private double price;

    public Stock() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
