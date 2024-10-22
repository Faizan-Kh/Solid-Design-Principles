/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.travel_system;

/**
 *
 * @author fa21-bse-011
 */
class CarRental {
    public void bookCar(String location) {
        System.out.println("Booking car rental in " + location + ".");
    }

    public void cancelCarRental() {
        System.out.println("Car rental canceled.");
    }
}

