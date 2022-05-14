/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class Parcel extends AnObject {

    private boolean fragile;

    public Parcel(double w, boolean fragile) {
        super(w);
        this.fragile = fragile;
    }

    public boolean getFragile() {
        return this.fragile;
    }

}
