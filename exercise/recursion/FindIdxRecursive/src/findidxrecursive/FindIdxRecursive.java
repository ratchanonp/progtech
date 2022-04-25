/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findidxrecursive;

/**
 *
 * @author ratchanon
 */
public class FindIdxRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arr = {"Hello", "Love", "good", "now", "yes", "now"};
        DataSet d = new DataSet(arr);
        int firstIDX = d.findIDX("a");
        if (firstIDX != -1) {
            System.out.println("Found at index " + firstIDX);
        } else {
            System.out.println("Not found");
        }
    }

}
