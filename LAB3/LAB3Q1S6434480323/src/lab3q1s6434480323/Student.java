/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q1s6434480323;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ratchanon
 */
public class Student {
    // instance variables
    private String name;
    private String id;
    private Calendar birthday;
    
    public Student(String initName, String initId) {
        name = initName;
        id = initId;
        birthday = new GregorianCalendar();
    }
    
    public Student(String initName, String initId, Calendar initBirthday) {
        name = initName;
        id = initId;
        birthday = initBirthday;
    }
    
    public void setBD(int birthDate, int birthMonth, int birthYear) {
        birthday.set(birthYear, birthMonth, birthDate);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Calendar getBD() {
        return birthday;
    }
    
    public String getName() {
        return name;
    }
    
    public String getID() {
        return id;
    }
    
    public int getAge() {
        Calendar today = new GregorianCalendar();
        int age = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        return age;
    }
    
    public int daysToYears(int days) {
        return days / 365;
    }
    
    public boolean equal(Student other) {        
        return id.equals(other.id)
                && name.equals(other.name)
                && birthday.get(Calendar.DATE) == other.birthday.get(Calendar.DATE)
                && birthday.get(Calendar.MONTH) == other.birthday.get(Calendar.MONTH)
                && birthday.get(Calendar.YEAR) == other.birthday.get(Calendar.YEAR);
    }
    
    public String toString() {
        int birthDay = birthday.get(Calendar.DATE);
        int birthMonth = birthday.get(Calendar.MONTH);
        int birthYear = birthday.get(Calendar.YEAR);
        
        String date = birthDay + " " + birthMonth + " " + birthYear;
        
        return id + " " + name + " " + date;
    }
    
    public String toStringAge() {
        int age = getAge();
        return id + " " + name + " " + age;
    }

    // Testing
    public static void main(String[] args) {
        Calendar birthday = new GregorianCalendar(2003, 0, 29);
        Student ratchanon = new Student("Ratchanon", "6434480323", birthday);
        System.out.println(ratchanon.toString());
    }
}
