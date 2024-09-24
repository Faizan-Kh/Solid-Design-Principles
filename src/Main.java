/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA21-BSe-011
 */
public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();

        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate();

        Switch fanSwitch = new Switch(fan);
        fanSwitch.operate();
    }
}
