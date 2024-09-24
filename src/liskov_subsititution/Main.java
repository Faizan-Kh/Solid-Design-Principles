/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov_subsititution;

/**
 *
 * @author FA21-BSe-011
 */
public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // Works fine

        Bird ostrich = new Ostrich();
        ostrich.makeSound(); // Works fine too
        // No need to call fly() on ostrich, adhering to LSP
    }
}
