/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public abstract class Vehicle {

    protected ArrayList<AnObject> arr = new ArrayList<AnObject>();
    private double maxLoad;

    public Vehicle(double ml) {
        maxLoad = ml;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    /* Answer */
    public abstract void carry(AnObject obj);

    public abstract double getTotalLoad();

    public String toString() {
        return getClass().getSimpleName() + " Max Load is " + getMaxLoad() + " Total Load is " + getTotalLoad();
    }
}
