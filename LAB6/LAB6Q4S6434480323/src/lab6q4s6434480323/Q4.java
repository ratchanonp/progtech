/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q4s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        
        System.out.println("Student 1: Enter ID, name");
        id = scanner.next();
        name = scanner.nextLine();
        Student Student1 = new Student(name, id);
        
        System.out.println("Student 2: Enter ID, name");
        id = scanner.next();
        name = scanner.nextLine();
        Student Student2 = new Student(name, id);
        
        System.out.print(Student1.sameYear(Student2) ? "Same year, " : "Different year, ");
        System.out.print(Student1.sameLevel(Student2) ? "Same level, " : "Different level, ");
        System.out.println(Student1.sameFaculty(Student2) ? "Same faculty" : "Different faculty");
        
    }
    
}
