/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class Car {

    // Instance Variable
    private double gas;
    private double efficiency;

    // Constructor
    public Car(double gas, double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }

    public void drive(double distance) {
        double useGas = distance / efficiency;
        
        if (useGas > this.gas) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            this.gas -= useGas;
        }
    }
    
    public void setGas(double amount){
        this.gas = amount;
    }
    
    public double getGas() {
        return this.gas;
    }
    
    public double getEfficiency(){
        return this.efficiency;
    }
    
    public void addGas(double amount){
        this.gas += amount;
    }
}
