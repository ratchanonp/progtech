/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q2s6434480323;

import java.util.Random;

/**
 *
 * @author ratchanon
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mtx a, b, c;
        
        a = new Mtx(randomMatrix(10, 5));
        b = new Mtx(randomMatrix(10, 5));
        c = new Mtx(randomMatrix(5, 3));
        
        /* Display Matrix */
        System.out.println("A =");
        Mtx.printMatrix(a.getMatrix());
        System.out.println("");
        
        System.out.println("B =");
        Mtx.printMatrix(b.getMatrix());
        System.out.println("");
        
        System.out.println("C =");
        Mtx.printMatrix(c.getMatrix());
        System.out.println("");
        
        
        /* A add B */
        if(a.equalSize(b)){
            System.out.println("A+B =");
            Mtx.printMatrix(a.add(b));
        } else {
            System.out.println("A and B are not same size");
        }
        System.out.println("");
        
        /* B mul 2 */
        System.out.println("2*B =");
        Mtx.printMatrix(b.mul(2));
        System.out.println("");
        
        /* A mul B */
        if(a.compatible(b)){
            System.out.println("A*B =");
            Mtx.printMatrix(a.mul(b));
        } else {
            System.out.println("A and B are not compatible");
        }
        System.out.println("");
        
        /* A mul C */
        if(a.compatible(c)){
            System.out.println("A*C =");
            Mtx.printMatrix(a.mul(c));
        } else {
            System.out.println("A and C are not compatible");
        }
        System.out.println("");
        
        
    }
    
   
    /**
     * Generate random value in range [-100, 100] Matrix size row by column
     * @param row
     * @param column
     * @return int[row][column] matrix
     */
    public static int[][] randomMatrix(int row, int column){
        Random random = new Random();
        int[][] temp = new int[row][column];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                temp[i][j] = random.nextInt(-100, 101);
            }
        }
        return temp;
    }
}
