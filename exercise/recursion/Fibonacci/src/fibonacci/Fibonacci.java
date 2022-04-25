/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find Fib of: ");
        int number = scanner.nextInt();

        System.out.println(fib(number));
    }

    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

}
