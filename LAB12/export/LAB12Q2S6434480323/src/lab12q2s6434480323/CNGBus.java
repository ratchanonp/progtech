/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class CNGBus extends Bus implements LiquidFuel {
    
    private double range;
    private int emissionTier;

    public CNGBus(int capacity, double cost, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }

    @Override
    public double getAccel() {
       return 3.0;
    }

    @Override
    public double getRange() {
        return this.range;
    }

    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
    
}
