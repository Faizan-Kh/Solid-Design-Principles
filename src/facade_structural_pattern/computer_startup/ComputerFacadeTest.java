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
public class ComputerFacadeTest {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        computer.shutdown();
    }
}
