/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1;

/**
 *
 * @author ratchanon
 */
public class Course {

    private int cID;
    private int section;
    private ArrayEx students;

    // Addtional
    private int seat;

    public Course(int cID, int section, int seat) {
        this.cID = cID;
        this.section = section;
        this.students = new ArrayEx(seat);

        // Additional
        this.seat = seat;
    }

    public boolean add(int stID) {
        return students.add(stID);
    }

    public void expand(int n) {
        int[] temp = students.toArray();
        
        this.students = new ArrayEx(seat + n);
        this.seat += n;
        
        // Add Old Student
        for(int student: temp){
            students.add(student);
        }
    }

    public boolean equals(Course that) {
        boolean hasSameStudent = false;

        for (int studentThis : this.students.toArray()) {
            for (int studentThat : that.students.toArray()) {
                if (studentThis == studentThat) {
                    hasSameStudent = true;
                    break;
                }
            }
        }

        return this.cID == this.cID && this.section == that.section && hasSameStudent;
    }
}
