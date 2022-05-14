/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author ratchanon
 */
public class DataSet {

    private double sum;
    private Measurable maximun;
    private int count;

    public void add(Measurable x) {
        sum = sum + x.getMeasure();

        if (count == 0 || maximun.getMeasure() < x.getMeasure()) {
            maximun = x;
        }

        count++;
    }

    public Measurable getMaximum() {
        return maximun;
    }
}
