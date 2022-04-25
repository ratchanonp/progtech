/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package power;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find x: ");
        int x = scanner.nextInt();

        System.out.print("Multiply n time: ");
        int n = scanner.nextInt();

        System.out.println(power(x, n));
    }

    public static long power(int x, int n) {
        if (n == 1) {
            return x;
        }

        return x * power(x, n - 1);
    }

}
