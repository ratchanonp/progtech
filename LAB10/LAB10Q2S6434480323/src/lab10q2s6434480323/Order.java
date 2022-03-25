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
    
    public Order(Customer c){
        this.c = c;
    }
    
    // เพิ่ม pizza ที่สั่งเก็บในใบ order,
    public void addPizza(Pizza p){
        
    }
    
    //ส่งคืนรายละเอียดของใบ order ซึ่งคือข้อมูลลูกค้า ข้อมูล pizza ที่สั่ง จำนวนถาดที่สั่งและราคารวม
    public String getOrderDetail(){
        return "";
    }
    
    
    // ส่งคืนค่าราคารวมที่คำนวณได้ โดยหากเป็นลูกค้าแบบ Gold ต้องอย่าลืมหักส่วนลด
    public double calculatePayment(){
        return -1;
    }
    
}
