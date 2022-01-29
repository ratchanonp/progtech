/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q1s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        int bornyear = 2022 - age;
        
        System.out.println(name + " was born in " + bornyear);
        
    }
    
}
