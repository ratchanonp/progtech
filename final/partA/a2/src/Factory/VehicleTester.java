/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public class VehicleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehicle> vArr = new ArrayList<Vehicle>();
        Truck t = new Truck(2500);
        t.carry(new Parcel(500, false));
        t.carry(new Parcel(600, false));
        t.carry(new Parcel(100, true));
        t.carry(new Human(75, 'M'));
        t.carry(new Human(65, 'M'));
        vArr.add(t);
        Truck t2 = new Truck(2000);
        t2.carry(new Parcel(500, true));
        t2.carry(new Parcel(600, false));
        t2.carry(new Parcel(100, true));
        t2.carry(new Human(75, 'M'));
        vArr.add(t2);

        for (Vehicle v : vArr) {
            System.out.println(v);
            System.out.println("Weight of parcel loaded is " + ((Truck) v).getParcelLoad());
        }
    }

}
