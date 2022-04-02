/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square a1 = new Square(0, 0, 2, 2, 0, 2, 2, 0);
        System.out.println(a1.toString());
        System.out.println("Area of square = " + a1.area());

        Square a2 = new Square(2, 2, 0, 2, 0, 0, 2, 0);
        System.out.println(a2.toString());
        System.out.println("Area of square = " + a2.area());

        Rectangle b1 = new Rectangle(2, 5, 0, 5, 0, 0, 2, 0);
        System.out.println(b1.toString());
        System.out.println("Area of rectangle = " + b1.area());

        Kite c1 = new Kite(0, 0, 1, 0, 0, 1, 4, 4);
        System.out.println(c1.toString());
        System.out.println("Area of kite = " + c1.area());

    }

}
