/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_structural_pattern.computer_startup;

/**
 *
 * @author fa21-bse-011
 */
class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data into memory from position " + position);
    }
}

