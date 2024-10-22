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
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON.");
    }
    
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    
    public void off() {
        System.out.println("DVD Player is OFF.");
    }
}

