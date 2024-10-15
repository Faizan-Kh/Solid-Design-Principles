/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.stockmarket;

/**
 *
 * @author fa21-bse-011
 */
public class Investor implements Observer{
     @Override
    public void update(double price) {
        System.out.printf("Stock price updated: $%.2f%n", price);
    }
}
