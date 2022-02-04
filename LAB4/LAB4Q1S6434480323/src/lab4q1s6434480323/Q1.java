/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4q1s6434480323;

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
        
        System.out.print("First point : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Second point : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.print("Third point : ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        
        System.out.print("Fourth point : ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        
        
        double centroidX = (float)(x1 + x2 + x3 + x4) / 4;
        double centroidY = (float)(y1 + y2 + y3 + y4) / 4;
        System.out.println("The centroid is ( "+ centroidX +", "+ centroidY +" ).");
        
        double distance1 = Math.sqrt(Math.pow(centroidX-x1, 2) + Math.pow(centroidY-y1, 2));
        double distance2 = Math.sqrt(Math.pow(centroidX-x2, 2) + Math.pow(centroidY-y2, 2));
        double distance3 = Math.sqrt(Math.pow(centroidX-x3, 2) + Math.pow(centroidY-y3, 2));
        double distance4 = Math.sqrt(Math.pow(centroidX-x4, 2) + Math.pow(centroidY-y4, 2));
        
        double sumOfDistance = distance1 + distance2 + distance3 + distance4;
        System.out.println("Sum of distance is " + sumOfDistance);
        
        double shortestDistance = Math.min(Math.min(distance1, distance2), Math.min(distance3, distance4));
        double longestDistance = Math.max(Math.max(distance1, distance2), Math.max(distance3, distance4));
        
        System.out.println("Shortest distance is " + shortestDistance);
        System.out.println("Longest distance is " + longestDistance);
        
    }
    
}
