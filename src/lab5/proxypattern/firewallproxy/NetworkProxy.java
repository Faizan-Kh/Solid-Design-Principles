/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.firewallproxy;

/**
 *
 * @author Faizan
 */
import java.util.List;

public class NetworkProxy {
    private List<String> allowedIps;
    private Network network;

    public NetworkProxy(List<String> allowedIps) {
        this.allowedIps = allowedIps;
        this.network = new Network();
    }

    public void requestAccess(String ip, String resource) {
        if (allowedIps.contains(ip)) {
            network.requestAccess(resource);
        } else {
            System.out.println("Access denied for IP: " + ip);
        }
    }
}

