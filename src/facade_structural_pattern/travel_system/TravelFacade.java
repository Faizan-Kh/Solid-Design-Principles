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
class TravelFacade {
    private Flight flight;
    private Hotel hotel;
    private CarRental carRental;

    public TravelFacade() {
        flight = new Flight();
        hotel = new Hotel();
        carRental = new CarRental();
    }

    public void bookTrip(String origin, String destination, String hotelLocation, int nights) {
        System.out.println("Booking your trip...");
        flight.bookFlight(origin, destination);
        hotel.bookHotel(hotelLocation, nights);
        carRental.bookCar(destination);
        System.out.println("Trip booked successfully!");
    }

    public void cancelTrip() {
        System.out.println("Canceling your trip...");
        flight.cancelFlight();
        hotel.cancelHotel();
        carRental.cancelCarRental();
        System.out.println("Trip canceled successfully!");
    }
}

