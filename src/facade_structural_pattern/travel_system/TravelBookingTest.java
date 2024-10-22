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
public class TravelBookingTest {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        
        // Booking a trip
        travelFacade.bookTrip("New York", "Los Angeles", "Los Angeles", 3);
        
        // Canceling the trip
        travelFacade.cancelTrip();
    }
}
