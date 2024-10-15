/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.newsagency;

/**
 *
 * @author fa21-bse-011
 */
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Subscriber subscriber1 = new Subscriber();
        
        agency.subscribe(subscriber1);
        
        agency.addArticle("Breaking News: New Java Features!");
        agency.addArticle("Tech Giants Merge!");
    }
}
