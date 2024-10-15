/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa21-bse-011
 */
public class WeatherStation {
     private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
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
            observer.update(temperature);
        }
    }
    
     public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
