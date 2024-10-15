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
public class Subscriber implements Observer{
    @Override
    public void update(String article) {
        System.out.println("New article published: " + article);
    }
}
