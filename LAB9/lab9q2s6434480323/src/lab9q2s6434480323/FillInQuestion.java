/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q2s6434480323;

import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class FillInQuestion extends Question {

    public FillInQuestion() {
        super();
    }

    public void constructQuestionAndAnswer(String questionText) {

        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        parser.close();
        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_ ";
        }
        this.setText(question);
        this.setAnswer(answer);
    }

}
