/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exam.pkg2019;

/**
 *
 * @author ratchanon
 */
public class Filter {

    protected static final int START_CAPACITY = 10000;
    protected int currentCapacity;

    public Filter() {
        currentCapacity = START_CAPACITY;
    }

    public void filter(int airVolumnInLiter) {
        this.currentCapacity = Math.max(0, currentCapacity - airVolumnInLiter);
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public String getFilterType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "[" + getFilterType() + "] Current Capacity: " + getCurrentCapacity();
    }
}
