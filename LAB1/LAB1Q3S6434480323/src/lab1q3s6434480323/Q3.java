/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q3s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        float n1 = scanner.nextFloat();
        
        System.out.print("Enter another number: ");
        float n2 = scanner.nextFloat();
        
        float product = n1 * n2;
        float sum = n1 + n2;
        float ratio = product / sum;
        
        System.out.println("The ratio between their product and their sum is "+ ratio);
    }
    
}
