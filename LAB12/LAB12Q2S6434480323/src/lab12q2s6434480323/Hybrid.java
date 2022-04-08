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
public class Hybrid extends Bus implements LiquidFuel, Electric {

    private double voltage;
    private double range;
    private int emissionTier;

    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);

        voltage = voltage < LOW_VOLTAGE ? LOW_VOLTAGE : voltage;
        voltage = voltage > HIGH_VOLTAGE ? HIGH_VOLTAGE : voltage;

        this.voltage = voltage;
        this.range = range;
        this.emissionTier = emissionTier;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }

    @Override
    public double getRange() {
        return this.range;
    }

    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }

    @Override
    public double getVoltage() {
        return this.voltage;
    }

}
