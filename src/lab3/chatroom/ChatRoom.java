/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa21-bse-011
 */
public class ChatRoom {
     private List<User> users = new ArrayList<>();

    public void register(User user) {
        users.add(user);
    }

    public void unregister(User user) {
        users.remove(user);
    }

    public void sendMessage(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}
