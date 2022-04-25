/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find Sum of: ");
        int number = scanner.nextInt();

        System.out.println(sum(number));
    }

    public static long sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);

    }
}
