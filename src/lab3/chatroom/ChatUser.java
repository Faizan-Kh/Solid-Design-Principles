/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.chatroom;

/**
 *
 * @author fa21-bse-011
 */
public class ChatUser implements User{
    private String name;

    public ChatUser(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }

    public String getName() {
        return name;
    }
}
