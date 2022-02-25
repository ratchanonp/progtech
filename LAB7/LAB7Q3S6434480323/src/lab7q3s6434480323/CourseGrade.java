/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q3s6434480323;

/**
 *
 * @author ratchanon
 */
public class CourseGrade {

    public Course course;
    public String grade;

    public CourseGrade(Course course, String grade) {
        this.course = course;
        this.grade = grade;
    }

    public double getGradeNumber() {
        return switch (this.grade) {
            case "A"  -> 4;
            case "B+" -> 3.5;
            case "B"  -> 3;
            case "C+" -> 2.5;
            case "C"  -> 2;
            case "D+" -> 1.5;
            case "D"  -> 1;
            case "F"  -> 0;
            default   -> 0;
        };
    }

    @Override
    public String toString() {
        return this.course.toString() + " " + this.grade;
    }
}
