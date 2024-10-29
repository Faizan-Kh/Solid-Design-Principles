/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.firewallproxy;

/**
 *
 * @author Faizan
 */
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        // Define allowed IPs
        NetworkProxy proxy = new NetworkProxy(Arrays.asList("192.168.0.1", "192.168.0.2"));

        // Request access with an allowed IP
        proxy.requestAccess("192.168.0.1", "Server1");  // Access granted

        // Request access with a disallowed IP
        proxy.requestAccess("192.168.0.3", "Server1");  // Access denied
    }
}

