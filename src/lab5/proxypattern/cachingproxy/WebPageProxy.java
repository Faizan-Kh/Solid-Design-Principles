/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.cachingproxy;

/**
 *
 * @author Faizan
 */
import java.util.HashMap;
import java.util.Map;

public class WebPageProxy {
    private final Map<String, String> cache = new HashMap<>();
    private final WebPageLoader loader = new WebPageLoader();

    public String fetchPage(String url) {
        if (!cache.containsKey(url)) {
            System.out.println("Loading from server...");
            cache.put(url, loader.fetchPage(url));
        } else {
            System.out.println("Fetching from cache...");
        }
        return cache.get(url);
    }
}
