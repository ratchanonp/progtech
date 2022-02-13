/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class Course {
    // Instance Variable
    private String courseName;  // ชื่อวิชา
    private String courseId;       // รหัสวิชา
    private int credit = 3;     // จำนวนหน่วยกิต (Defualt : 3)
    
    // Constructor 2 value 
    public Course(String courseName, String courseId){
        this.courseName = courseName;
        this.courseId = courseId;
    }
    
    // Constructor 3 value
    public Course(String courseName, String courseId, int credit){
        this.courseName = courseName;
        this.courseId = courseId;
        this.credit = credit;
    }
    
    public void setCid(String courseId){
        this.courseId = courseId;
    }
    
    public void setCname(String courseName){
        this.courseName = courseName;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    
    public String getCname(){
        return this.courseName;
    }
    
    public String getCid(){
        return this.courseId;
    }
    
    public int getCredit(){
        return this.credit;
    }
    
    public boolean equals(Course other){
        return this.courseId.equals(other.courseId) &&
               this.courseName.equals(other.courseName) && 
               this.credit == other.credit;
    }
    
    public int compare(Course other){
        if (this.equals(other)) return 0;
        
        boolean isSameCourseId = this.courseId.equals(other.courseId);
        boolean isSameCourseName = this.courseName.equals(other.courseName);
        boolean hasSameCredit = this.credit == other.credit;
        
        if(!isSameCourseId && isSameCourseName && hasSameCredit) return 1;
        else if(isSameCourseId && !isSameCourseName && hasSameCredit) return 2;
        else if(isSameCourseId && isSameCourseName && !hasSameCredit) return 3;
        else if(isSameCourseId && !isSameCourseName && !hasSameCredit) return 4;
        else if(!isSameCourseId && isSameCourseName && !hasSameCredit) return 5;
        else if(!isSameCourseId && !isSameCourseName && hasSameCredit) return 6;
        else return 7;
    }
    
    @Override
    public String toString(){
        return this.courseId + " " +  this.courseName + " " + this.credit;
    }
    
    public int sumCredit(Course other){
        return this.credit + other.credit;
    }
}
