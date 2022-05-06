/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6434480323pa;

/**
 *
 * @author ratchanon
 */
public class Actor {

    public static boolean[][] board = new boolean[8][8];

    private int x;
    private int y;

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;

        board[y][x] = true;
    }

    public boolean moveUpR() {
        if (x == 7 || y == 7) {
            return false;
        }

        if (board[y + 1][x + 1]) {
            return false;
        }

        board[y + 1][x + 1] = true;
        board[y][x] = false;

        x = x + 1;
        y = y + 1;

        return true;
    }

    public boolean moveUpL() {
        if (x == 0 || y == 7) {
            return false;
        }

        if (board[y + 1][x - 1]) {
            return false;
        }

        board[y + 1][x - 1] = true;
        board[y][x] = false;

        x = x - 1;
        y = y + 1;

        return true;
    }

    public boolean moveDnR() {
        if (x == 7 || y == 0) {
            return false;
        }

        if (board[y - 1][x + 1]) {
            return false;
        }

        board[y - 1][x + 1] = true;
        board[y][x] = false;

        x = x + 1;
        y = y - 1;

        return true;
    }

    public boolean moveDnL() {
        if (x == 0 || y == 0) {
            return false;
        }

        if (board[y - 1][x - 1]) {
            return false;
        }

        board[y - 1][x - 1] = true;
        board[y][x] = false;

        x = x - 1;
        y = y - 1;

        return true;
    }

    public static void printBoard() {
        for (int i = 7; i >= 0; i--) {
            System.out.print("y=" + i);
            for (int j = 0; j < 8; j++) {
                if (board[i][j]) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.print("  x");
        for (int i = 0; i < 8; i++) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}
