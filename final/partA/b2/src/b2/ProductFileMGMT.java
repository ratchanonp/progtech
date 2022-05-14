/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ratchanon
 */
public class ProductFileMGMT {

    private java.io.RandomAccessFile raf = null;
    public static final int RECORD_SIZE = 16;

    public ProductFileMGMT(File f) {
        try {
            raf = new java.io.RandomAccessFile(f, "rw");
        } catch (FileNotFoundException ex) {
        }
    }

    public long size() {
        try {
            return raf.length();
        } catch (IOException ex) {
            return -1;
        }
    }

    public int find(int prodID) throws IOException {
        int id;
        for (int i = 0; i * RECORD_SIZE < size(); i++) { //ใช้ size() ด้านบน
            raf.seek(i * RECORD_SIZE);
            id = raf.readInt();
            if (id == prodID) // พบรหัสสินค้า
            {
                return i; // คืนค่าเป็นเลขที่ของรายการข้อมูล (record number)
            }
        }
        return -1; // ไม่พบรหัสสินค้า คืนค่า -1
    }

    public void insertNewProd(int ID, int amt, double uprice) {
        if (size() == 0) {
            try {
                raf.writeInt(ID);
                raf.writeInt(ID);
                raf.writeDouble(uprice);
            } catch (IOException ex) {

            }
        } else {
            try {
                raf.seek(size());
                raf.writeInt(ID);
                raf.writeInt(ID);
                raf.writeDouble(uprice);
            } catch (IOException ex) {

            }
        }
    }

    public void updateProdAmt(int rec, char type, int amt) {
        try {
            raf.seek(find(rec));
            int amount = raf.readInt();

            if (type == 'A') {
                raf.writeInt(amount + amt);
            } else if (amt <= amount) {
                raf.writeInt(amount - amt);
            } else {
                System.out.println("Amount exceeds stock");
            }

        } catch (IOException ex) {

        }

    }

    public void readFile() throws IOException {
        int cntProdGrp = 0, ID; // cntProdGrp คือตัวแปรนับจำนวนของสินค้า
        int totalPiece = 0, amt; // totalPiece คือตัวแปรนับจำนวนชิ้นรวมของสินค้า
        double totalValue = 0, uprice;

        raf.seek(0);

        while (raf.getFilePointer() != size()) {
            ID = raf.readInt();
            amt = raf.readInt();
            uprice = raf.readDouble();

            cntProdGrp += 1;
            totalPiece += amt;
            totalValue += amt * uprice;
        }

        System.out.println("There are " + cntProdGrp + " products");
        System.out.println("Total pieces are " + totalPiece);
        System.out.println("Total value is " + totalValue);
    }

    public void closeFile() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }

}
