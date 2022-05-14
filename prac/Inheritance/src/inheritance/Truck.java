/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class Truck extends Car {

    public Truck(int fuel) {
        super(fuel);
    }

    public void drive() {
        System.out.println("Drive Truck " + this.getFuel());
    }
}
