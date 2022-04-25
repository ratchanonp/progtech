/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computingfactorial;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class ComputingFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Find Fact of: ");
        int number = scanner.nextInt();
        System.out.println(fact(number));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
