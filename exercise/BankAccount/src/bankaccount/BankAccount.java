/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author ratchanon
 */
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(String name, double initialBalance) {
        try {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial Balance of " + initialBalance + " cannot be negative.");
            } else {
                owner = name;
                balance = initialBalance;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposite(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Deposit of " + amount + " cannot be negative.");
            } else {
                balance += amount;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        balance = balance + amount;
    }

    public void widthdraw(double amount) {
        try {
            if (amount > balance) {
                throw new IllegalArgumentException("Withdrawal of " + amount + " exceeds balance of " + balance);
            } else {
                balance -= amount;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
