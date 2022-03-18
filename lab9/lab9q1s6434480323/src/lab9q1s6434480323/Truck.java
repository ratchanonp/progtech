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
public class Truck extends Car {
    // Additional Instance Variable
    private double M_weight;
    private double weight;
    
    
    public Truck(double gas, double efficiency, double M_weight,double weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;
        
        if (weight > M_weight){
            this.weight = M_weight;
        } else {
            this.weight = weight;
        }
    }
    
    @Override
    public void drive(double distance){
        double additionalGas;
        double useGas = distance / super.getEfficiency();
        
        if(this.weight < 1){
            additionalGas = 0;
        } else if(this.weight <= 10){
            additionalGas = useGas * 0.1;
        } else if(this.weight <= 20){
            additionalGas = useGas * 0.2;
        } else {
            additionalGas = useGas * 0.3;
        }
        
        useGas += additionalGas;
        
        if (useGas > super.getGas()) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            super.setGas(super.getGas() - useGas);
        }
    }
}
