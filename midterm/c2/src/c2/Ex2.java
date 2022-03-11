/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;

/**
 *
 * @author ratchanon
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (double i = 1; i <= 100; i = i + 0.001) {
            
            if (Math.pow(i, i / 10) < 30000000 * i) {
                System.out.println(Math.pow(i, i / 10) + "\t" + 30000000 * i);
                System.out.println("i=" + i);
                break;
            }
        }
    }

}
