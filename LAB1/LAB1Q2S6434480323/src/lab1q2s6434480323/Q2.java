/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q2s6434480323;

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
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter birth year: ");
        int birthyear = scanner.nextInt();
        
        final int currentyear = 2565;
        int age = currentyear - birthyear;
        
        System.out.println(name + " is " + age + " years old.");
    }
    
}
