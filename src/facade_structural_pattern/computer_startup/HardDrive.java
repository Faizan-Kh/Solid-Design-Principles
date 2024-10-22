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
class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive at position " + lba);
        return new byte[size]; // Simulating read data
    }
}

