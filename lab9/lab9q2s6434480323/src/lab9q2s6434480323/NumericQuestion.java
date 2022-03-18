/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class NumericQuestion extends Question {

    public NumericQuestion(String text) {
        super(text);
    }

    @Override
    public boolean checkAnswer(String response){
        return Math.abs(Double.parseDouble(response) - Double.parseDouble(this.getAnswer())) < 0.01;
    }
}
