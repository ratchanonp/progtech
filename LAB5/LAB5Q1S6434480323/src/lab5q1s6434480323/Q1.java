
package lab5q1s6434480323;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        System.out.println("Press 1 to sum three integers.");
        System.out.println("Press 2 to find roots of a quadratic equation.");
        System.out.println("Press 3 to find the area of a rectangle.");
        System.out.println("Press 4 to print A's.");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter 3 integers:");
                
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                int n3 = scanner.nextInt();
                
                System.out.println("Sum : " + (n1 + n2 + n3));
                break;
            case 2:
                System.out.println("Enter a, b,c for ax^2+bx+c=0 :");
                
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                
                double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a *c))) / (2 * a);
                double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a *c))) / (2 * a);
                
                System.out.println("Two roots: " + x1 + ", " + x2);
                break;
            case 3:
                System.out.println("Enter the length of 2 sides of the rectangle:");
                
                double s1 = scanner.nextDouble();
                double s2 = scanner.nextDouble();
                
                System.out.println("Area: " + (s1 * s2));
                break;
            case 4:
                System.out.println("How many A’s?");
                
                int times = scanner.nextInt();
                System.out.println("A".repeat(times));
                break;
            default:
                System.out.println("Invalid choice");
                
        }
    }
}
