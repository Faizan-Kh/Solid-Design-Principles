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
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting the computer...");
        cpu.freeze();
        memory.load(0x001, hardDrive.read(0x001, 64));
        cpu.jump(0x001);
        cpu.execute();
    }

    public void shutdown() {
        System.out.println("Shutting down the computer...");
    }
}

