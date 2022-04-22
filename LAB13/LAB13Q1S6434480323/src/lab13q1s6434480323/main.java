/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q1s6434480323;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filePath = "src/lab13q1s6434480323/text.txt";

        Scanner scanner = new Scanner(System.in);

        try {
            PrintWriter output = new PrintWriter(filePath);
            String line = scanner.nextLine();
            while (!line.equals("quit")) {
                output.println(line);
                line = scanner.nextLine();
            }

            output.close();

            fileReading(filePath);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void fileReading(String path) {
        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                words += line.split(" ").length;
                characters += line.length();
                lines++;

            }

            System.out.println("Total characters : " + characters);
            System.out.println("Total words : " + words);
            System.out.println("Total lines : " + lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
