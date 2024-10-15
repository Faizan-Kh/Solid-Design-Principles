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
public class CheckList {
     public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        System.out.println("   Establish a perimeter");
    }

    protected void isolate() {
        System.out.println("   Isolate the grid");
    }

    protected void identify() {
        System.out.println("   Identify the source");
    }
}
