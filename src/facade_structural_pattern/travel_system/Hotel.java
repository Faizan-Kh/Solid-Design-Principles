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
class Hotel {
    public void bookHotel(String location, int nights) {
        System.out.println("Booking hotel in " + location + " for " + nights + " nights.");
    }

    public void cancelHotel() {
        System.out.println("Hotel booking canceled.");
    }
}

