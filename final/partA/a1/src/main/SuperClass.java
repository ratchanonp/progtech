/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ratchanon
 */
public class SuperClass {

    int x = 0;

    public SuperClass(int x) {
        this.x = x;
    }

    private void add10() {
        x += 10;
    }

    protected final void add(int y) {
        x += y;
    }

    protected void display() {
        System.out.println(x);
    }
}
