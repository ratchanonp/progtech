/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q2s6434480323;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date currentDate = new Date();        
        Calendar today = new GregorianCalendar();     
        Scanner scanner = new Scanner(System.in);
        
        today.setTime(currentDate);
        
        System.out.println("Current Date: " + today.get(Calendar.DAY_OF_MONTH) + " " + today.get(Calendar.MONTH) + ", " + today.get(Calendar.YEAR));
        
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int month = scanner.nextInt() - 1;
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
            
        Calendar endDate = new GregorianCalendar(year, month, day);
        
        long daysBetween = (endDate.getTimeInMillis() - today.getTimeInMillis()) / (24 * 60 * 60 * 1000) + 1;
        
        System.out.println("Number of days:" + daysBetween);
    }
    
}
