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
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TempratureDisplay display1 = new TempratureDisplay();
        
        weatherStation.register(display1);
        
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}