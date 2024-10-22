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
class CarFacade {
    private Engine engine;
    private Battery battery;
    private FuelPump fuelPump;
    private Radiator radiator;

    public CarFacade(Engine engine, Battery battery, FuelPump fuelPump, Radiator radiator) {
        this.engine = engine;
        this.battery = battery;
        this.fuelPump = fuelPump;
        this.radiator = radiator;
    }

    public void startCar() {
        System.out.println("Starting the car...");
        battery.supplyPower();
        fuelPump.pump();
        radiator.on();
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping the car...");
        engine.stop();
        radiator.off();
    }
}
