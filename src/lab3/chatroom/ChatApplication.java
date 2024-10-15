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
public class ChatApplication {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        
        ChatUser user1 = new ChatUser("Alice");
        ChatUser user2 = new ChatUser("Bob");
        ChatUser user3 = new ChatUser("Charlie");

        chatRoom.register(user1);
        chatRoom.register(user2);
        chatRoom.register(user3);

        chatRoom.sendMessage("Hello, everyone!");
        
        chatRoom.unregister(user2);
        chatRoom.sendMessage("Bob has left the chat.");
    }
}
