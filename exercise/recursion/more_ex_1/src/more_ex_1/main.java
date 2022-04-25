/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package more_ex_1;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some integer: ");
        int i = scanner.nextInt();

        System.out.println(SumSeries(i));

    }

    public static float SumSeries(int i) {
        if (i == 1) {
            return 1.0f / 2.0f;
        }
        return ((float) i / (i + 1)) + SumSeries(i - 1);
    }

}
