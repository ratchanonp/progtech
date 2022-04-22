/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434480323;

/**
 *
 * @author ratchanon
 */
public class TransactionRecord {

    private int acctNo;
    private double amount;

    public TransactionRecord(int acctNo, double amount) {
        this.acctNo = acctNo;
        this.amount = amount;
    }

    public int getAccountNo() {
        return this.acctNo;
    }

    public void setAccountNumber(int number) {
        this.acctNo = number;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
