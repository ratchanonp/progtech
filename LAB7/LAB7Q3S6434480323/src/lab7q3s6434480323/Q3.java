/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q3s6434480323;

import java.util.Arrays;
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

        String id;
        String name;

        String[] input;
        String courseName;
        String courseId;
        int credit;

        String grade;

        /* Student Section */
        Student[] listStudent = new Student[3];
        System.out.println("Enter 3 student ID and name:");
        for (int i = 0; i < 3; i++) {
            id = scanner.next();
            name = scanner.nextLine().trim();
            listStudent[i] = new Student(name, id);
        }

        /* Course Section */
        Course[] listCourse = new Course[5];
        System.out.println("Enter 5 course ID, name and credit:");
        for (int i = 0; i < 5; i++) {
            input = scanner.nextLine().split(" ");

            courseId = input[0];
            courseName = String.join(" ", Arrays.copyOfRange(input, 1, input.length - 1));
            credit = Integer.parseInt(input[input.length - 1]);

            listCourse[i] = new Course(courseName, courseId, credit);
        }

        /* Student Grade report */
        // Loop Through Every Student
        for (int i = 0; i < 3; i++) {
            System.out.println(listStudent[i].getName() + "grade report:");

            courseId = scanner.next();
            while (!courseId.equals("X")) {
                grade = scanner.next();

                Course course = findCourse(listCourse, courseId);
                listStudent[i].addGradeReport(course, grade);

                courseId = scanner.next();
            }
        }

        /* Transcript */
        for (Student student : listStudent) {
            System.out.println("------ Transcript ------");
            System.out.println("  " + student.toStringIdName());
            student.registerCourse().forEach((subject) -> System.out.println(subject));
            System.out.println("  GPA: " + student.calGPA());
        }
    }

    public static Course findCourse(Course[] listCourse, String courseId) {
        for (Course course : listCourse) {
            if (course.getCid().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}

/*
6341234423 Tana Anat
6331234423 Anat Tana
6430248821 Mane Enam
2301260 Prog Tech 4
2301170 Comp Prog 3
2301172 Comp Prog Lab 1
2301117 Cal I 4
2301263 Data Str 4
2301260 A
2301170 A
2301172 A
X
2301260 A
2301263 B
2301170 B+
2301172 A
X
2301170 B+
2301117 B
2301172 B
X
 */
