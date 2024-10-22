/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.car_ignition_system;

/**
 *
 * @author fa21-bse-011
 */
public class FacadePatternCarTest {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Battery battery = new Battery();
        FuelPump fuelPump = new FuelPump();
        Radiator radiator = new Radiator();
        
        CarFacade carFacade = new CarFacade(engine, battery, fuelPump, radiator);
        
        carFacade.startCar();
        carFacade.stopCar();
    }
}

