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
public class MGenStudent extends MGenCard {
    
    private static final float discount = 20;
    
    public MGenStudent(String name){
        super(name);
    }
    
    @Override
     public void buyTicket(Cinema cinema, int n){        
        super.buyTicket(cinema, n);
        
        int totalPrice = cinema.getTicketPrice() * n;
        double discountPrice = totalPrice * (MGenStudent.discount / 100);    
        
        System.out.println("You got " + discountPrice + " discount");
    }
}
