/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class Secretary extends Employee implements Evaluation {
    private int typingSpeed;
    private int[] score;
    
    public Secretary(String name, int salary, int[] score, int typingSpeed){
        super(name, salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }

    @Override
    public double evaluate() {
        int total = 0;
        for (int sc: score) {
            total += sc;
        }
        return total;
    }

    @Override
    public char grade(double score) {
        if (score >= 90) {
            super.setSalary(18000);
            return 'P';
        } 
        
        return 'F';
    }
}
