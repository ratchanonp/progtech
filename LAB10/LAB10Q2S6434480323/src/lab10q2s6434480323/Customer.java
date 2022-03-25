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
public class Customer {
    private String name;
    private String tel;
    
    public Customer(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    
    @Override
    public String toString() {
        return this.name + " tel : " + this.tel;
    }
}
