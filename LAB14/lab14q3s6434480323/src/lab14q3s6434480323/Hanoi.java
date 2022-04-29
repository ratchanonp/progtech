/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q3s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //System.out.print("Enter number of disks : ");
        //int n = inp.nextInt();
        int n = 3;

        moveDisks(n, 'A', 'B', 'C');
    }

    private static void moveDisks(int n, char from, char aux, char to) {
        if (n == 0) {
            return;
        }

        moveDisks(n - 1, from, to, aux);

        System.out.println("Move " + n + " from " + from + " to " + to);

        moveDisks(n - 1, aux, from, to);
    }

}
