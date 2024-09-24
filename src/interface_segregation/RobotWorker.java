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
public class RobotWorker implements Workable{
     @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
