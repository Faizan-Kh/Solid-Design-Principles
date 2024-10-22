/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.hometheatre;

/**
 *
 * @author fa21-bse-011
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Lights lights = new Lights();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, amplifier, dvdPlayer, lights);
        
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}

