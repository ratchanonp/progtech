/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class MGenFirstClass extends MGenCard {

    // Instance Variable
    private int freeTicket = 2;

    public MGenFirstClass(String name) {
        super(name);
    }

    public void getFreeTicket() {
        if (freeTicket == 2) {
            System.out.println("You got 2 Cinema tickets");
            this.freeTicket -= 2;
        } else {
            System.out.println("You alreaday got the free tickets");
        }
        
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "[free ticket : " + this.freeTicket + "]";
    }
}
