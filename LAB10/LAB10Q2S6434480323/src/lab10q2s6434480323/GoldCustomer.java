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
public class GoldCustomer extends Customer {
    private double discount;
    
    public GoldCustomer(String name, String tel, double discount){
        super(name, tel);
        this.discount = discount;
    }
    
    public double getDiscount() {
        return this.discount;
    }
    
    @Override
    public String toString(){
        return super.toString() + " discount : " + this.discount;
    }
}
