/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q2s6434480323;

import java.util.ArrayList;
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
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        ArrayList<Integer> primeArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            
            if (i == 0 || i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                primeArr.add(i);
            }
        }

        System.out.println("");
        for (int i = 0; i < primeArr.size(); i++) {
            System.out.println(primeArr.get(i));
        }
    }

}
