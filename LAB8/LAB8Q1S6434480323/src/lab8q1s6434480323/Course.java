/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q1s6434480323;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public class Course {
    // Instance Variable
    private String courseName;  // ชื่อวิชา
    private String courseId;       // รหัสวิชา
    private int credit = 3;     // จำนวนหน่วยกิต (Defualt : 3)
    
    // Class Variable
    private static int numCourse = 0;
    private static ArrayList<FacCourse> facultyCourse = new ArrayList<FacCourse>();
    
    // Constructor 2 value 
    public Course(String courseName, String courseId){
        this.courseName = courseName;
        this.courseId = courseId;
        
        this.newFacultyCourse(courseId);
        Course.numCourse++;
    }
    
    // Constructor 3 value
    public Course(String courseName, String courseId, int credit){
        this.courseName = courseName;
        this.courseId = courseId;
        this.credit = credit;
        
        this.newFacultyCourse(courseId);
        Course.numCourse++;
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
    
    
    /* Lab 8 add */
    public static int numberOfCourses() {
        return Course.numCourse;
    }
    
    public static int numberOfFacCourses(int facultyCode) {
        for(FacCourse faculty : facultyCourse){
            if(faculty.getFacultyCode() == facultyCode){
                return faculty.getNumberOfCourse();
            }
        }
        return -1;
    }
    
    /* Additional Method Lab 8 For Me */
    /**
     * This Method find IndexOfFaculty
     * @param facultyCode
     * @return <li>-1 if facultyCode doesn't exist</li>
     *         <li>IndexOfFaculty if facultyCode exist</li>
     */
    private int getIndexOfFaculty(int facultyCode) {
        for(int i = 0 ; i < facultyCourse.size(); i++){
            if(facultyCourse.get(i).getFacultyCode() == facultyCode){
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * This method handle FacultyCourse add
     * <li>if facultyCode exist increase number of course</li>
     * <li>else add new FacCourse to facultyCourse ArrayList</li>
     * 
     * @param courseId
     */
    public void newFacultyCourse(String courseId){
        int facultyCode = Integer.parseInt(courseId.substring(0, 2));
        int indexOfFaculty = this.getIndexOfFaculty(facultyCode);
        
        if (indexOfFaculty != -1){
            facultyCourse.get(indexOfFaculty).addCourse();
            // System.out.println("Add course in " + facultyCode + " : " +  facultyCourse.get(indexOfFaculty).getNumberOfCourse());
        } else {
            facultyCourse.add(new FacCourse(facultyCode));
            // System.out.println("New Course in " + facultyCode + " : " +  facultyCourse.get(this.getIndexOfFaculty(facultyCode)).getNumberOfCourse() );
        }
    }
    
    /**
     * This method get all faculty in ArrayList facultyCourse
     * @return ArrayList of all faculty
     */
    public static ArrayList<Integer> getAllFaculty(){
        
        ArrayList<Integer> facultyList = new ArrayList<>();
        facultyCourse.forEach((faculty) -> facultyList.add(faculty.getFacultyCode()));
        return facultyList;
    }
    /* End of Additional Method for LAB8 */
    
    /* Testing Method*/
    public static void main(String[] args) {
        Course progtech = new Course("PROG TECH", "2301260");
        Course progtech2 = new Course("PROG TECH 2", "2301260");
        Course expeng = new Course("EXP ENG 2", "5555555");
        
        System.out.println(Course.numCourse);
    }
}
