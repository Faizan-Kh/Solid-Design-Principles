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
public class ReportGenerator {
    private String content;

    public ReportGenerator(String content) {
        this.content = content;
    }
    
    public String generate() {
        System.out.println("Generating report: " + content);
        return content;
    }
    
}