/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4q3s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x;
        double y;
        
        System.out.print("Point A: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point point1 = new Point(x, y);
        
        System.out.print("Point B: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point point2 = new Point(x, y);
        
        System.out.println("A = " + point1.toString() + " B = " + point2.toString() + " Distance = " + point1.distance(point2));
        
        System.out.print("Move the points: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        point1.translate(x, y);
        point2.translate(x, y);
        
        System.out.println("A = " + point1.toString() + " B = " + point2.toString() + " Distance = " + point1.distance(point2));
        System.out.println(point1.equals(point2) ? "A and B are at the same position." : "A and B are not at the same position.");
    }
    
}
