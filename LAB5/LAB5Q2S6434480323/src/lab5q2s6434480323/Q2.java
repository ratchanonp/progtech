/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q2s6434480323;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] input;
        String courseName;
        int courseId;
        int credit;
        
        // Course 1
        System.out.print("Enter course ID, course name, credit: ");
        input = scanner.nextLine().split(" ");
        
        courseId = Integer.parseInt(input[0]);
        courseName = String.join(" ", Arrays.copyOfRange(input, 1, input.length - 1));
        credit = Integer.parseInt(input[input.length - 1]);
        
        Course course1 = new Course(courseName, courseId, credit);
        
        // Course 2
        System.out.print("Enter course ID, course name: ");
        input = scanner.nextLine().split(" ");
        courseId = Integer.parseInt(input[0]);
        courseName = String.join(" ", Arrays.copyOfRange(input, 1, input.length));
        
        Course course2 = new Course(courseName, courseId);
        
        // Check is same course
       if (course1.equals(course2)){
           System.out.println("Same course");
           System.out.print("Enter course ID, course name: ");
           
           input = scanner.nextLine().split(" ");
        
           courseId = Integer.parseInt(input[0]);
           courseName = String.join(" ", Arrays.copyOfRange(input, 1, input.length - 1));
           credit = Integer.parseInt(input[input.length - 1]);
           
           course2.setCid(courseId);
           course2.setCname(courseName);
           course2.setCredit(credit);
       } else {
           System.out.println(compareToString(course1.compare(course2)));
       }
       
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println("Total credit: " + course1.sumCredit(course2));
    }
    
    /**
     *
     * @param type
     * @return String that show what is different
     */
    public static String compareToString(int type){
        return switch (type) {
            case 0 -> "No different";
            case 1 -> "Different course ID";
            case 2 -> "Different course name";
            case 3 -> "Different credit";
            case 4 -> "Different course name and credit";
            case 5 -> "Different course ID and credit";
            case 6 -> "Different course ID and course name";
            case 7 -> "Different course ID, course Name and credit";
            default -> "Error Not match any case";
        };
    }
}
