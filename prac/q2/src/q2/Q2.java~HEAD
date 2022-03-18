/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

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
        Scanner scanner = new Scanner(System.in);
        
        int inpStart, inpStop;
        int aStart, aStop;
        int bStart, bStop;
        
        System.out.print("Interval A: ");
        inpStart = scanner.nextInt();
        inpStop = scanner.nextInt();
        
        aStart = Math.min(inpStart, inpStop);
        aStop = Math.max(inpStart, inpStop);
        
        System.out.print("Interval B: ");
        inpStart = scanner.nextInt();
        inpStop = scanner.nextInt();
        
        bStart = Math.min(inpStart, inpStop);
        bStop = Math.max(inpStart, inpStop);
        
        // Check Equal
        if (aStart == bStop && aStop == bStart) {
            System.out.println("A equals B");
        }
        
        // Check Precedes
        else if (aStop < bStart) {
            System.out.println("A precedes B");
        }
        else if (bStop < aStart) {
            System.out.println("B is preceded by A");
        }
        
        // Check met
        else if (bStart == aStop){
            System.out.println("A meets B");
        }
        else if (aStart == bStop){
            System.out.println("B is met by A");
        }
        
        // Check overlap
        else if (bStart > aStart && bStart < aStop && bStop > aStop){
            System.out.println("A overlaps B");
        }
        else if (aStart > bStart && aStart < bStop && aStop > bStop){
            System.out.println("B is overlapped by A");
        }
        
        // Check start
        else if (aStart == bStart && aStop < bStop){
            System.out.println("A starts B");
        }
        else if (aStart == bStart && bStop < aStop){
            System.out.println("A is started by B");
        }
        
        // Check finished
        else if (aStop == bStop && aStart > bStart){
            System.out.println("A finishes B");
        }
        else if (aStop == bStop && bStart > aStart){
            System.out.println("A is finished by B");
        }
        
        // Check contain
        else if (aStart < bStart && aStop > bStop){
            System.out.println("A contains B");
        }
        else if (bStart < aStart && bStop > aStop){
            System.out.println("B is during B");
        }
        
        
    }
    
}
