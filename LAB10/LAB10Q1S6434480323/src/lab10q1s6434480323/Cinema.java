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
public class Cinema {

    private String name; // ชื่อโรงภาพยนตร์
    private int ticketPrice; // ราคาตั๋วหนัง

    public Cinema(String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
}
