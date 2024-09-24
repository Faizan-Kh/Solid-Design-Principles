/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open_closed;

/**
 *
 * @author FA21-BSe-011
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.totalArea(shapes));
    }
}