/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        System.out.print("Enter temperature in C :");
        int c = kybd.nextInt();
        if (c*9/5>212)
            System.out.println("Higher than boiling point");
        else if (c*9/5>32)
            System.out.println("Between freezing and boiling points");
        else if (c*9/5==212)
            System.out.println("At boiling point");
        else if (c*9/5==32)
            System.out.println("At freezing point");
        else
            System.out.println("Below freezing point");
    }
}
