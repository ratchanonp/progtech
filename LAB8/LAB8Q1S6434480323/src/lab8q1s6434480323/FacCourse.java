/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class FacCourse {

    private int facultyCode;
    private int numCourse;

    public FacCourse(int facultyCode) {
        this.facultyCode = facultyCode;
        this.numCourse = 1;
    }
    
    public void addCourse() {
        this.numCourse++;
    }

    public int getFacultyCode() {
        return this.facultyCode;
    }

    public int getNumberOfCourse() {
        return this.numCourse;
    }
}
