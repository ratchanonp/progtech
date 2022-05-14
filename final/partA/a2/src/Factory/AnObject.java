/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author ratchanon
 */
public abstract class AnObject {

    private double weight; //use only weight, not depend on size

    public AnObject(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }
}
