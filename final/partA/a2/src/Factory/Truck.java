/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class Truck extends Vehicle {

    public Truck(double ml) {
        super(ml);
    }

    public double getTotalLoad() {
        double total = 0;
        for (AnObject o : arr) {
            total = total + o.getWeight();
        }
        return total;
    }

    public double getParcelLoad() {
        double total = 0;
        for (AnObject o : arr) {
            if (o instanceof Parcel p) {
                total = total + p.getWeight();
            }
        }
        return total;
    }

    public void carry(AnObject obj) {
        if (obj instanceof Parcel p) {
            if (p.getFragile()) {
                System.out.println("Truck cannot load fragile parcel.");
            } else if (p.getWeight() <= super.getMaxLoad() - this.getTotalLoad()) {
                arr.add(obj);
            }
        } else {
            arr.add(obj);
        }
    }
}
