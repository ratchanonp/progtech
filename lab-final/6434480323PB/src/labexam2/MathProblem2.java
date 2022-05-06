/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexam2;

public class MathProblem2 extends MathProblem1 {

    public MathProblem2(int N) {
        super(N);
    }

    @Override
    public void setQandK() {

        String question = "";
        int key = 0;

        int operand1 = r.nextInt(super.getN()) + 1;
        int operand2 = r.nextInt(super.getN()) + 1;
        int operand3 = r.nextInt(super.getN()) + 1;
        int operator1 = r.nextInt(2) + 1;
        int operator2 = r.nextInt(2) + 1;

        switch (operator1) {
            case 1:
                question = operand1 + " x " + operand2;
                break;
            case 2:
                question = operand1 + " + " + operand2;
                break;
        }

        switch (operator2) {
            case 1:
                question += " x " + operand3;
                break;
            case 2:
                question += " + " + operand3;
                break;
        }

        // Key process
        if (operator1 == 1 && operator2 == 1) {
            key = operand1 * operand2 * operand3;
        } else if (operator1 == 1 && operator2 == 2) {
            key = operand1 * operand2 + operand3;
        } else if (operator1 == 2 && operator2 == 1) {
            key = operand1 + operand2 * operand3;
        } else if (operator1 == 2 && operator2 == 2) {
            key = operand1 + operand2 + operand3;
        }

        question += " = ?";
        super.setQuestion(question);
        super.setKey(key);
    }
}
