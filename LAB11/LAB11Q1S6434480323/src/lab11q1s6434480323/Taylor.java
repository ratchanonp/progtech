/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11q1s6434480323;

/**
 *
 * @author ratchanon
 */
public abstract class Taylor {
    private int k;
    private double x;
    
    public Taylor(int k, double x){
        this.k = k;
        this.x = x;
    }
    
    public int factorial(int n){
        if (n >= 1)
            return n * this.factorial(n - 1);
        else
            return 1;
    }
    
    public int getIteration(){
        return this.k;
    }
    
    public double getValue(){
        return this.x;
    }
    
    public abstract void printValue();
    public abstract double getApprox();
}
