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
class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON.");
    }
    
    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
    
    public void off() {
        System.out.println("Amplifier is OFF.");
    }
}