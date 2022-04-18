/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author ratchanon
 */
public class BankAccountTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount a = new BankAccount("A", -10);
        BankAccount b = new BankAccount("B", 100);
        b.deposite(-500);
        b.widthdraw(300);
        System.out.println(b.getOwner() + " has " + b.getBalance());
    }

}
