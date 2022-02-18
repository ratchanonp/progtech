/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q1s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumGrade = 0;
        double sumCredit = 0;

        System.out.println("Enter course ID, credit and grade; or X to terminate");
        String subject = scanner.next();

        while (!subject.equals("X")) {
            int credit = scanner.nextInt();
            String grade = scanner.next();

            sumCredit += credit;
            sumGrade += gradeToNumber(grade) * credit;

            subject = scanner.next();
        }

        if (sumGrade != 0 && sumCredit != 0) {
            double GPA = sumGrade / sumCredit;
            System.out.println("GPA = " + GPA);
        }
    }

    public static double gradeToNumber(String grade) {
        return switch (grade) {
            case "A"  -> 4.0;
            case "B+" -> 3.5;
            case "B"  -> 3.0;
            case "C+" -> 2.5;
            case "C"  -> 2.0;
            case "D+" -> 1.5;
            case "D"  -> 1.0;
            default -> 0;
        };
    }
}
/*
2301170 3 A
2301172 1 A
2301117 4 B+
X
 */
