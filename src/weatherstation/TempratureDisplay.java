/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author fa21-bse-011
 */
public class TempratureDisplay implements Observer {

    @Override
    public void update(int temprature) {
        System.out.println("Temprature is updated: "+ temprature + "°C");
    }
    
}
