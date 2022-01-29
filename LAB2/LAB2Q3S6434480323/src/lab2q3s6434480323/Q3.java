/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q3s6434480323;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
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
        Date currentDate = new Date();        
        Calendar today = new GregorianCalendar();     
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        today.setTime(currentDate);
           
        int day = rand.nextInt(28 - 1) + 1;
        int month = rand.nextInt(11);
        int year = rand.nextInt(2021 - 2000) + 2000;        
    
        Calendar birthDate = new GregorianCalendar(year, month, day);
        
        
        System.out.println("Current Date: " + today.get(Calendar.DAY_OF_MONTH) + "-" + today.get(Calendar.MONTH) + "-" + today.get(Calendar.YEAR));  
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Current Date: " + day + "-" + month + "-" + year);
        
        long daysBetween = (today.getTimeInMillis() - birthDate.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        
        System.out.println("Age in days: " + daysBetween);
    }
    
}
