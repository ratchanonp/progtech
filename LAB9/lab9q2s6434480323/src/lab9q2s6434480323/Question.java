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
public class Question {

    // Instance Variable
    private String text;
    private String answer;
    
    public Question() {}

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer){
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return this.answer.equals(response);
    }

    public void display() {
        System.out.println(this.text);
    }
}
