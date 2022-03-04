/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q1s6434480323;

import java.util.ArrayList;
import java.util.Arrays;
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
        String[] input;
        
        String courseId;
        String courseName;
        int credit;
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        
        System.out.println("Enter course ID, name, credit: or X to stop");
        input = scanner.nextLine().split(" ");
        
        while(!input[0].equals("X")){
            courseId = input[0];
            courseName = String.join(" ", Arrays.copyOfRange(input, 1, input.length - 1));
            credit = Integer.parseInt(input[input.length - 1]);
            
            courseList.add(new Course(courseName, courseId, credit));
            input = scanner.nextLine().split(" ");
        }
        
        System.out.println(Course.numberOfCourses() + " courses");
        for(int faculty : Course.getAllFaculty()){
            System.out.println(Course.numberOfFacCourses(faculty) + " courses for " + faculty);
        }
    }
    
}

/*
2301170 Comp Prog 3
2301260 Prog Tech 4
2110101 Comp Prog 3
X
*/
