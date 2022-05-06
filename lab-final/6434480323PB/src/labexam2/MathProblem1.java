/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexam2;

import java.util.Random;

/**
 *
 * @author ratchanon
 */
public class MathProblem1 {

    public static Random r = new Random();

    private int N;
    private String question;
    private int answer;
    private int key;

    public MathProblem1(int N) {
        this.N = N;

    }

    public void setQandK() {
        int operand1 = r.nextInt(N) + 1;
        int operand2 = r.nextInt(N) + 1;
        int operator = r.nextInt(2) + 1;

        switch (operator) {
            case 1:
                question = operand1 + " x " + operand2;
                key = operand1 * operand2;
                break;
            case 2:
                question = operand1 + " + " + operand2;
                key = operand1 + operand2;
                break;
        }

        question += " = ?";
    }

    public String getQuestion() {
        return question;
    }

    public int chkAnswer(int answer) {
        this.answer = answer;

        if (answer == this.key) {
            return 1;
        }
        return 0;
    }

    public int getN() {
        return N;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + getQuestion() + ":" + this.key + "\nYour answer is " + this.answer;
    }
}
