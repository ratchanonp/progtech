/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ratchanon
 */
public class SupSubTester {

    public static void main(String[] args) {
        SuperClass sc = new SuperClass(3);
        sc.display();

        sc = new SubClass(3);
        sc.display();

        sc = new SubClass(1);
        sc.add(1);
        sc.display();
    }
}
