/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class MOCK2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        
        int sum = 0;
        
        // เติมส่วนของโปรแกรม
        System.out.println("Enter 10 scores");
        for (int i = 0; i < 10; i++) {
            int score = input.nextInt();
            scores.add(score);
            sum += score;
        }
        double average = (double) sum / 10;
        
        System.out.println("Above average scores:");
        for (int i = 0; i < 10; i++) {
            if (scores.get(i) > average) {
                // เติมส่วนของโปรแกรม
                System.out.print(scores.get(i)+ "  ");
            }
        }
    }
}

/*
26
20
22
24
25
15
17
28
24
25
*/