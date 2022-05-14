/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ratchanon
 */
public class RandomAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File f = new File("product.dat");
        ProductFileMGMT pf = new ProductFileMGMT(f);
        int choice, ID, amt, rec;
        //rec บอกว่า เป็น record number ที่เท่าไหร่ ใช้ช่วยในการเข้าถึงข้อมูลสินค้าในไฟล์
        double uprice;
        String input; //สมมติว่าลูกค้าจะเลือกตัวเลือกถูกต้องและกรอกข้อมูลที่ไม่เป็นค่าลบ
        while (true) {
            System.out.print("Select 1-Add new product, 2-add amount to stock, 3-remove amount from stock : ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter product ID : ");
                    ID = in.nextInt();
                    System.out.print("Enter amount : ");
                    amt = in.nextInt();
                    System.out.print("Enter unit price : ");
                    uprice = in.nextDouble();
                    rec = pf.find(ID); //นำรหัสสินค้าไปค้นหาในไฟล์

                    if (rec == -1) //กรณีไม่พบ ได้ record number คืนมาเป็น -1 เพิ่มสินค้าใหม่ได้
                    {
                        pf.insertNewProd(ID, amt, uprice);
                    } else //กรณีพบ แจ้งข้อความเตือน
                    {
                        System.out.println("Product already exists");
                    }
                    break;

                case 2:
                    System.out.print("Enter product ID : ");
                    ID = in.nextInt();
                    rec = pf.find(ID);
                    if (rec != -1) { //กรณีพบ
                        System.out.print("Enter amount : ");
                        amt = in.nextInt();
                        pf.updateProdAmt(rec, 'A', amt); //เพิ่มจำนวนสินค้า
                    } else {
                        System.out.println("Product ID is not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter product ID : ");
                    ID = in.nextInt();
                    rec = pf.find(ID);
                    if (rec != -1) { //กรณีพบ
                        System.out.print("Enter amount : ");
                        amt = in.nextInt();
                        pf.updateProdAmt(rec, 'R', amt); //ลดจำนวนสินค้า
                    } else {
                        System.out.println("Product ID is not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print(
                    "Do you want to continue? (Y/N) : ");
            input = in.next();

            if (input.equalsIgnoreCase(
                    "N")) {
                break;
            }
        }
        pf.readFile();
        pf.closeFile();
    }
}
