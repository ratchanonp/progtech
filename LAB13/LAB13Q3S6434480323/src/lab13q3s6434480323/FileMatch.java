/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434480323;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class FileMatch {

    public static void main(String[] args) {

        ArrayList<AccountRecord> accountRecords = new ArrayList<>();
        ArrayList<TransactionRecord> transactionRecords = new ArrayList<>();

        String masterFilePath = "src/lab13q3s6434480323/master.txt";
        String transFilePath = "src/lab13q3s6434480323/trans.txt";
        String newMasterFilePath = "src/lab13q3s6434480323/newMaster.dat";

        // Read Account file
        File masterFile = new File(masterFilePath);
        try ( Scanner master = new Scanner(masterFile)) {
            while (master.hasNextLine()) {
                String[] masterInputList = master.nextLine().split(" ");

                int acctNo = Integer.parseInt(masterInputList[0]);
                String name = masterInputList[1] + " " + masterInputList[2];
                double balance = Double.parseDouble(masterInputList[3]);

                accountRecords.add(new AccountRecord(acctNo, name, balance));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Read Transaction file
        File transFile = new File(transFilePath);
        try ( Scanner trans = new Scanner(transFile)) {
            while (trans.hasNextLine()) {
                String[] transInputList = trans.nextLine().split(" ");

                int acctNo = Integer.parseInt(transInputList[0]);
                double amount = Double.parseDouble(transInputList[1]);

                transactionRecords.add(new TransactionRecord(acctNo, amount));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Matching Transaction with account and update balance
        matching(accountRecords, transactionRecords);

        // Write to dat file
        try ( RandomAccessFile r = new RandomAccessFile(newMasterFilePath, "rw")) {
            accountRecords.forEach((account) -> {
                try {
                    r.writeInt(account.getAcctNo());
                    r.writeChars(account.getName());
                    r.writeChars(" ".repeat(30 - account.getName().length()));
                    r.writeDouble(account.getBalance());
                    r.writeInt(account.getTransCnt());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Read from dat file
        try ( RandomAccessFile r = new RandomAccessFile(newMasterFilePath, "r")) {
            int totalRecord = 0;
            double balance = 0;
            int noTransacCnt = 0;

            while (r.getFilePointer() != r.length()) {
                r.readInt();
                totalRecord++;

                r.skipBytes(30 * 2); // Skip name

                balance += r.readDouble();
                if (r.readInt() == 0) {
                    noTransacCnt++;
                }
            }
            System.out.println("Total Account Record : " + totalRecord);
            System.out.println("Total balance : " + balance);
            System.out.println("No transaction : " + noTransacCnt + " account.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     This method use for matching and update account balance
     */
    private static void matching(ArrayList<AccountRecord> accountRecords, ArrayList<TransactionRecord> transactionRecords) {
        for (AccountRecord account : accountRecords) {
            for (TransactionRecord transaction : transactionRecords) {
                if (transaction.getAccountNo() == account.getAcctNo()) {
                    account.combine(transaction);
                }
            }
        }
    }
}
