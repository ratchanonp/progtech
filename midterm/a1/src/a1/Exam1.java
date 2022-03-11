/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n0: ");
        
        n0 = input.nextInt();
        
        while(n0 != 0){
            System.out.print(n0 + " ");
            
            n0 = (int) Math.floor((double) n0 / 2);
        }
    }
}
