/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q3s6434480323;

import java.io.File;
import java.io.FileNotFoundException;
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
        try {    
            File scoreFile = new File("src/score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            
            double score;
            double max = 0;
            double min = 0;
            double sum = 0;
            int count = 1;
            
            // Check Have data in file
            if (scoreReader.hasNextLine()){
                score = scoreReader.nextDouble();
                max = score;
                min = score;
                sum = score;
            }
            
            
            while (scoreReader.hasNextLine()) {
                score = scoreReader.nextDouble();
                
                sum += score;
                count++;
                
                if (score > max) max = score;
                if (score < min) min = score;
            }
            
            double average = sum / count;
        
            System.out.println("Average score = " + average);
            System.out.println("Highest score = " + max);
            System.out.println("Lowest score = " + min);

            scoreReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred." + e);
        }
        
        
    }
    
}
