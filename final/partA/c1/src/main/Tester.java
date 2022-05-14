/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ratchanon
 */
public class Tester {

    public static void main(String[] args) {
        Z z = new B();
        z.methodZ();

        B b = new B();
        b.one(0);
        b.one();

        A a1 = new C();
        a1.two();

        C c = new C();
        c.add(c);
    }
}
