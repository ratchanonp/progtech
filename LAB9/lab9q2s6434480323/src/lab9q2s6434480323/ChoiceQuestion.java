/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q2s6434480323;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public class ChoiceQuestion extends Question {

    // Additional Instance Variable
    private ArrayList<String> choices;

    public ChoiceQuestion(String text) {
        super(text);
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);

        if (correct) {
            this.setAnswer(Integer.toString(choices.indexOf(choice) + 1));
        }
    }

    public void display() {
        System.out.println(this.getText());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }
    }
}
