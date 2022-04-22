/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434480323;

/**
 *
 * @author ratchanon
 */
public class AccountRecord {

    private int acctNo;
    private String name;
    private double balance;
    private int transCnt = 0;

    public AccountRecord(int acctNo, String name, double balance) {
        this.acctNo = acctNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransCnt() {
        return transCnt;
    }

    public void combine(TransactionRecord t) {
        this.balance += t.getAmount();
        this.transCnt++;
    }
}
