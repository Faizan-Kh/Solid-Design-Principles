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
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor investor1 = new Investor();
        Investor investor2 = new Investor();
        
        stock.register(investor1);
        stock.register(investor2);
        
        stock.setPrice(150.75);
        stock.setPrice(155.00);
    }
}
