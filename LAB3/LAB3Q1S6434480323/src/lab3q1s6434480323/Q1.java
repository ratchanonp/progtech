/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q1s6434480323;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        
        String name;
        String id;
        int birthDay;
        int birthMonth;
        int birthYear;
        Calendar bd = new GregorianCalendar();
        
        // Student 1
        System.out.println("Student 1: Enter ID, birthday, name");
        
        id = scanner.next();
        birthDay = scanner.nextInt();
        birthMonth = scanner.nextInt();
        birthYear = scanner.nextInt();
        name = scanner.nextLine();
        
        bd.set(birthYear, birthMonth - 1, birthDay);
        
        Student std1 = new Student(name, id, bd);
        
        // Student 2
        System.out.println("Student 2: Enter ID, name");
        
        id = scanner.next();
        name = scanner.nextLine();
        
        Student std2 = new Student(name, id);
        
        // Print age and check is same
        System.out.println("Student 1: " + std1.toStringAge());
        System.out.println("Student 2: " + std2.toStringAge());
        System.out.println((std1.equal(std2)) ? "same": "not same"); 
        
        // Set new Birthday for student 2
        System.out.println("Enter birthday for Student 2");
        
        birthDay = scanner.nextInt();
        birthMonth = scanner.nextInt();
        birthYear = scanner.nextInt();
        
        std2.setBD(birthDay, birthMonth, birthYear);
        
        // Print age and check is same 
        System.out.println("Student 1: " + std1.toStringAge());
        System.out.println("Student 2: " + std2.toStringAge());
        System.out.println((std1.equal(std2)) ? "same": "not same"); 
    }
    
}
