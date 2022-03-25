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
public class MGenCard {
    
    // Class Variable
    public static int memberFee = 150; // ค่าสมัครสมาชิก บัตรทุกแบบมีค่าสมัครเท่ากันหมดคือ 150
    public static int cnt = 0; // นับจำนวนบัตรสมาชิกที่สร้างขึ้นมา และใช้กำหนดหมายเลขบัตรสมาชิก
    
    // Instance Varibale
    private int number; // หมายเลขบัตรสมาชิก
    private String name; // ชื่อสมาชิก
    private int point; // แต้มสะสม เพื่อใช้ในการแลกตั๋วฟรี

    public MGenCard(String name) {
        cnt++;
        this.number = cnt;
        this.name = name;
    }

    public void usePoint() {
        // ให้ใช้แต้ม 20 แต้มแลกตั๋วฟรีได้ครั้งละ 1 ใบเท่านั้น แล้วแสดงข้อความว่า You got a free Cinema ticket
        if (point >= 20) {
            System.out.println("You got a free Cinema ticket");
            point -= 20;
        } // แต่ถ้าแต้มไม่พอแลก ให้แสดงข้อความว่า You don't have enough points
        else {
            System.out.println("You don't have enough points");
        }
        // ก่อนจบ method ให้เรียก toString() เพื่อสั่งพิมพ์ค่า ณ ปัจจุบัน
        System.out.println(toString());
    }
    
    public void buyTicket(Cinema cinema, int n){
        int totalPrice = cinema.getTicketPrice() * n;
        int receivePoint = (int) totalPrice / 50;
        
        this.point += receivePoint;
        
        System.out.println(cinema.getName() + " Total amount : " + totalPrice);
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return "iconcineconic." + this.getClass().getSimpleName() + "[number : " + this.number + ", name : " + this.name + ", point : " + this.point + "]" ;
    }
    
}
