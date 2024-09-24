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
public class Main {
    public static void main(String[] args){
        ReportGenerator reportGenerator = new ReportGenerator("Monthly sales data");
        String reportContent = reportGenerator.generate();
        
        EmailSender emailSender = new EmailSender();
        emailSender.send(reportContent, "Faizan@gmail.com");
    }
}
