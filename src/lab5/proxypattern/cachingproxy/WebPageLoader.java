/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.cachingproxy;

/**
 *
 * @author Faizan
 */
public class WebPageLoader {
    public String fetchPage(String url) {
        System.out.println("Fetching page from " + url);
        return "Content of " + url;
    }
}

