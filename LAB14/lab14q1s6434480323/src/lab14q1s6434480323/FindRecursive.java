/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class FindRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sentence s = new Sentence("Prog Tech");
        boolean b = s.find("Te");

        if (b) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

}
