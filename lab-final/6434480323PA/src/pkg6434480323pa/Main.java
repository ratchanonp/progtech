/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6434480323pa;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Actor b1 = new Actor(3, 5);
        Actor b2 = new Actor(2, 2);
        String move;
        Actor.printBoard();
        int hit1 = 3;
        int hit2 = 3;
        while (hit1 > 0 && hit2 > 0) {
            // Player 1 moves
            System.out.print("Player 1: choose W, S, A, D: ");
            move = input.nextLine().trim();
            if (move.equalsIgnoreCase("W")) {
                if (!b1.moveUpR()) {
                    hit1--;
                }
            } else if (move.equalsIgnoreCase("S")) {
                if (!b1.moveDnR()) {
                    hit1--;
                }
            } else if (move.equalsIgnoreCase("A")) {
                if (!b1.moveUpL()) {
                    hit1--;
                }
            } else if (move.equalsIgnoreCase("D")) {
                if (!b1.moveDnL()) {
                    hit1--;
                }
            }
            b1.printBoard();

            // Player 2 moves
            System.out.print("Player 2: choose W, S, A, D: ");
            move = input.nextLine().trim();
            if (move.equalsIgnoreCase("W")) {
                if (!b2.moveUpR()) {
                    hit2--;
                }
            } else if (move.equalsIgnoreCase("S")) {
                if (!b2.moveDnR()) {
                    hit2--;
                }
            } else if (move.equalsIgnoreCase("A")) {
                if (!b2.moveUpL()) {
                    hit2--;
                }
            } else if (move.equalsIgnoreCase("D")) {
                if (!b2.moveDnL()) {
                    hit2--;
                }
            }
            b2.printBoard();
        }
        System.out.println("End");
    }

}
