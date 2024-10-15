/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.ecommerce;

/**
 *
 * @author fa21-bse-011
 */
public class OnlineCustomer implements Customer{
    private String name;

    public OnlineCustomer(String name) {
        this.name = name;
    }
    @Override
    public void update(String product, boolean available) {
        String message = available ? "is now available!" : "is out of stock!";
        System.out.println(name + ", the product '" + product + "' " + message);
    }
}
