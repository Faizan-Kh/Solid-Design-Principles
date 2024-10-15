/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.sensorsystem;

/**
 *
 * @author fa21-bse-011
 */
public class Surveillance extends CheckList implements AlarmListener{
    @Override
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    @Override
    protected void isolate() {
        System.out.println("   Train the cameras");
    }
}
