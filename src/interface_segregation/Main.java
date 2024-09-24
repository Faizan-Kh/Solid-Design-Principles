/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_segregation;

/**
 *
 * @author FA21-BSe-011
 */
public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        human.work();

        Workable robot = new RobotWorker();
        robot.work();
    }
}
