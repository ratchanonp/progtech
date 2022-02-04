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
        
        String input = scanner.nextLine();
        
        input = input.trim();
        
        int space = input.indexOf(" ");
        String firstname = input.substring(0, space).trim();
        
        int space2 = input.indexOf(" ", space + 1);
        String lastname = input.substring(space, space2).trim();
        
        String age = input.substring(space2).trim();
        
        
        System.out.println(lastname + ", " + firstname + " is " + age + " years old.");
        
    }
    
}
