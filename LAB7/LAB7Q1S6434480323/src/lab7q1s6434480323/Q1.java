/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q1s6434480323;

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

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[] primeArr = new int[n];

        int num = 0;
        int i = 0;
        while (i < n) {
            boolean isPrime = true;
            if (num == 0 || num == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeArr[i] = num;
                i++;
            }

            num++;
        }

        System.out.println("");
        for (int j = 0; j < n; j++) {
            System.out.println(primeArr[j]);
        }
    }
}
