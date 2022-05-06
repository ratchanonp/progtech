/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexam2;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class LabExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opVal, score = 0, in, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter range of operand value : ");
        opVal = input.nextInt();
        MathProblem1 arr[] = new MathProblem1[5];
        for (i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = new MathProblem1(opVal);
            } else {
                arr[i] = new MathProblem2(opVal);
            }
            arr[i].setQandK();
            System.out.println("Question is " + arr[i].getQuestion());
            System.out.print("Your answer is ");
            in = input.nextInt();
            score += arr[i].chkAnswer(in);
        }

        System.out.println(
                "---Test details---");
        for (i = 0;
                i < arr.length;
                i++) {
            System.out.println(arr[i]);
        }
        System.out.println(
                "You got " + score + " points");
    }

}
