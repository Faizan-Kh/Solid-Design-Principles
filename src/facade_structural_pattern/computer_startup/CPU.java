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
class CPU {
    public void freeze() {
        System.out.println("CPU is freezing...");
    }

    public void jump(long position) {
        System.out.println("CPU is jumping to position " + position);
    }

    public void execute() {
        System.out.println("CPU is executing instructions.");
    }
}
