/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.newsagency;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa21-bse-011
 */
public class NewsAgency {
    private List<Observer> subscribers;
    private List<String> articles;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
        this.articles = new ArrayList<>();
    }

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        if (!articles.isEmpty()) {
            for (Observer subscriber : subscribers) {
                subscriber.update(articles.get(articles.size() - 1));
            }
        }
    }

    public void addArticle(String article) {
        articles.add(article);
        notifySubscribers();
    }
}
