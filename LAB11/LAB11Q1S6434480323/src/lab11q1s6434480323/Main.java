/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();
        
        
        /* Part 2 */
        System.out.println("\n===== Part 2 =====");
        Taylor[] taylorArr = new Taylor[3];
        taylorArr[0] = new Expo(7, 1);
        taylorArr[1] = new Sine(7, Math.PI/4);
        taylorArr[2] = new Cosine(7, 1);
        
        for(int i=0;i<3;i++){
            taylorArr[i].printValue();
        }
        
    }
    
}
