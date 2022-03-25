/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class PizzaTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double revenue = 0;
        
        // all customers
        Customer c[] = new Customer[5];
        c[0] = new Customer("Sasipa", "0894567122");
        c[1] = new Customer("Monnat", "0867867101");
        c[2] = new GoldCustomer("Mike", "0858822355", 10);
        c[3] = new GoldCustomer("Peach", "0860775611", 15);
        c[4] = new GoldCustomer("Samor", "0894567122", 5);
        
        // ส่วนลด 10 หมายถึง 10%
        // all types of pizza
        Pizza piz[] = new Pizza[5];
        piz[0] = new Pizza("Hawaiian", 199);
        piz[1] = new PizzaSpecial("Hawaiian plus", 259, "with cheese edge");
        piz[2] = new Pizza("Meat Lovers", 239);
        piz[3] = new PizzaSpecial("Meat Lovers plus", 299, "with cheese edge");
        piz[4] = new PizzaSpecial("Meat Lovers x 2", 299, "with extra meat");
        
        //first order
        Order o1 = new Order(c[1]);
        o1.addPizza(piz[0]);
        o1.addPizza(piz[2]);
        System.out.println(o1.getOrderDetail());
        revenue += o1.calculatePayment();
        
        //second order
        Order o2 = new Order(c[3]);
        o2.addPizza(piz[0]);
        o2.addPizza(piz[4]);
        System.out.println(o2.getOrderDetail());
        revenue += o2.calculatePayment();
        
        // end of day
        System.out.println("Total revenue of today : " + revenue);
    }

}
