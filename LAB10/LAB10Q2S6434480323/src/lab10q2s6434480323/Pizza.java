/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class Pizza {
    
    // Instance Variable
    private String name;
    private double price;
    
    public Pizza(String name,double price){
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return this.name + " price : " + this.price;
    }
}
