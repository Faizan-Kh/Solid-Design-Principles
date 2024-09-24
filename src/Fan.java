/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA21-BSe-011
 */
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off.");
    }
}