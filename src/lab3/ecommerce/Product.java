/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa21-bse-011
 */
public class Product {
     private String name;
    private boolean available;
    private List<Customer> customers = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.available = false; // Initially unavailable
    }

    public void register(Customer customer) {
        customers.add(customer);
    }

    public void unregister(Customer customer) {
        customers.remove(customer);
    }

    public void setAvailability(boolean available) {
        this.available = available;
        notifyCustomers();
    }

    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(name, available);
        }
    }
}
