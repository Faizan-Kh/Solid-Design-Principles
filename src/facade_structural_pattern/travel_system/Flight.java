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
class Flight {
    public void bookFlight(String origin, String destination) {
        System.out.println("Booking flight from " + origin + " to " + destination + ".");
    }

    public void cancelFlight() {
        System.out.println("Flight canceled.");
    }
}

