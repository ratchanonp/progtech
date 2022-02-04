/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4q2s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter firstname lastname age: ");
        
        String firstname = scanner.next();
        String lastname = scanner.next();
        int age = scanner.nextInt();
        
        firstname = firstname.trim();
        lastname = lastname.trim();
        
        System.out.println(lastname + ", " + firstname + " is " + age + " years old.");
        
    }
    
}
