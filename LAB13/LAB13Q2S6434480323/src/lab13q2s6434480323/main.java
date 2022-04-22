/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q2s6434480323;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
        Scanner scanner = new Scanner(System.in);
        String inputString;

        ArrayList<String> wordNotContained = new ArrayList<>();
        ArrayList<String> wordList = new ArrayList<>();

        System.out.print("Enter a sentence: ");
        inputString = scanner.nextLine();

        File wordListFile = new File("src/lab13q2s6434480323/wordlist.txt");

        try ( Scanner reader = new Scanner(wordListFile)) {
            while (reader.hasNextLine()) {
                wordList.add(reader.nextLine());
            }

            for (String inputWord : inputString.split(" ")) {
                boolean isContain = false;

                for (String word : wordList) {
                    if (inputWord.equals(word)) {
                        isContain = true;
                        break;
                    }
                }

                if (!isContain) {
                    wordNotContained.add(inputWord);
                }
            }

            System.out.println("Words not contained:");
            if (!wordNotContained.isEmpty()) {
                System.out.println(String.join(" ", wordNotContained));
            } else {
                System.out.println("N/A");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

/**
 * test case this is fantastic this is awesome prog tech
 */
