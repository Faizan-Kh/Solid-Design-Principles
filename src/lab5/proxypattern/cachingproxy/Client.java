/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.cachingproxy;

/**
 *
 * @author Faizan
 */
public class Client {
    public static void main(String[] args) {
        WebPageProxy proxy = new WebPageProxy();

        // First request - fetches from server and caches it
        System.out.println(proxy.fetchPage("http://example.com"));

        // Second request - fetches from cache
        System.out.println(proxy.fetchPage("http://example.com"));
    }
}
