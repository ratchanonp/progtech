/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q2s6434480323;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class DirectorySize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }

    private static long getSize(File directory) {
        long length = 0;

        File[] files = directory.listFiles();

        // traverse through directory
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            } else {
                // If is directory traverse
                length += getSize(files[i]);
            }
        }
        return length;
    }

}
