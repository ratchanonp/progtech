package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ratchanon
 */
public class A implements Y {

    public void one() {
        System.out.println("A");
    }

    public void two() {
        one();
        System.out.println("AA");
    }

    public void methodY() {
        System.out.println("In Y");
    }

}
