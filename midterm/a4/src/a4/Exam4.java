/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4;

/**
 *
 * @author ratchanon
 */
public class Exam4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {98, 76, 85, 57, 24, 85, 57, 49, 72, 76, 49, 72, 27};
        double[] avg4 = new double[data.length - 3];
        
        System.out.println("COVID-19 patients");
        for(int number : data){
            System.out.print(number + " ");
        }

        
        System.out.println("\n\n4-day moving average");
        for (int i = 3; i < data.length; i++) {
            int sum = 0;
            for (int j = 3; j >= 0; j--) {
                sum += data[i - j];
            }
            avg4[i-3] = (double) sum / 4;
        }
        
        for(double avg: avg4){
            System.out.println(avg);
        }
    }

}
