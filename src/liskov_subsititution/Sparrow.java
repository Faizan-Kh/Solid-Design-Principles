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
public class Sparrow implements FlyingBird{
     @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}
