/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single_responsibility;

/**
 *
 * @author FA21-BSe-011
 */
public class EmailSender {
    public void send(String reportContent, String recipient){
        System.out.println("Sending report to: " + recipient);
        System.out.println("Report content: "+ reportContent);
    }
}
