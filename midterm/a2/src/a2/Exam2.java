/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String price;
        ArrayList<Integer> indexOfNeg = new ArrayList<>();
        
        System.out.println("Enter prices & press s/S to stop.");
        price = input.next();
        
        int count = 0;
        while(!price.equals("s") && !price.equals("S")){
            double priceNumber = Double.parseDouble(price);
            
            if (priceNumber < 0){
                indexOfNeg.add(count);
            }
            
            count++;
            price = input.next();
        }
        
        System.out.println("Items with incorrect prices:");
        for(int index: indexOfNeg){
            System.out.print(index + " ");
        }
        
    }
    
}

/*
26
20.5
22.25
-24
25
-15
-17.5
28
S

26
20.5
22.25
24
25
15
17.5
28
s
*/
