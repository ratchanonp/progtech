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
public class Subject implements Evaluation {

    private String subjName;
    private int[] score;
    
    public Subject(String subjName, int[] score){
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        int total = 0;
        int count = score.length;
        
        for (int sc: score){
            total += sc;
        }
        
        return (double) total / count;
    }

    @Override
    public char grade(double score) {
        return score >= 70 ? 'P' : 'F';
    }
    
    @Override
    public String toString(){
        return this.subjName;
    }

}
