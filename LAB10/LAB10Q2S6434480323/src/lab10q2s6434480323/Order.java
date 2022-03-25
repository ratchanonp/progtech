/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10q2s6434480323;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public class Order {

    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p;

    public Order(Customer c) {
        this.p = new ArrayList<>();
        this.id = Order.cntOrder + 1;
        this.c = c;
        Order.cntOrder++;
    }

    // เพิ่ม pizza ที่สั่งเก็บในใบ order,
    public void addPizza(Pizza pizza) {
        p.add(pizza);
    }

    //ส่งคืนรายละเอียดของใบ order ซึ่งคือข้อมูลลูกค้า ข้อมูล pizza ที่สั่ง จำนวนถาดที่สั่งและราคารวม
    public String getOrderDetail() {
        
        String str = "Order id : " + this.id + "\n";
        str += c.toString() + "\n";
        for (Pizza pizza : p){
            str += pizza.toString() + "\n";
        }
        
        str += "Total pieces : " + this.p.size() + "\n";
        str += "Total cost : " + calculatePayment();
        
        return str;
    }

    // ส่งคืนค่าราคารวมที่คำนวณได้ โดยหากเป็นลูกค้าแบบ Gold ต้องอย่าลืมหักส่วนลด
    public double calculatePayment() {
        double total = 0;

        for (Pizza pizza : p) {
            total += pizza.getPrice();
        }

        if (c.getClass().getSimpleName().equals("GoldCustomer")) {
            total -= (((GoldCustomer) c).getDiscount() / 100) * total;
        }

        return total;
    }

}
