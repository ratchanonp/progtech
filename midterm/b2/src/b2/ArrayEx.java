/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.util.Arrays;

/**
 *
 * @author ratchanon
 */
public class ArrayEx {

    // Instance
    private int[] ar;
    private int size;
    private int cursor;

    // Constructor
    public ArrayEx(int size) {
        this.ar = new int[size];
        this.size = size;
        this.cursor = 0;
    }

    /* Method */
    public boolean add(int element) {
        if (this.cursor < this.size) {
            this.ar[this.cursor] = element;
            this.cursor++;
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= size || index < 0) {
            return false;
        }

        for (int i = index; i < this.size; i++) {
            if(i == this.size - 1){
                this.ar[i] = 0;
            } else {
                this.ar[i] = this.ar[i + 1];
            }
        }

        return true;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int[] toArray() {
        int count = 0;
        for (int value : this.ar) {
            if (value != 0) {
                count++;
            }
        }

        int[] temp = new int[count];
        int index = 0;
        for (int value : this.ar) {
            if (value != 0) {
                temp[index++] = value;
            }
        }
        return temp;
    }
    
    public int[] toSortedArray(){
        int temp[] = this.toArray();
        Arrays.sort(temp);
        return temp;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "[ ";
        
        for(int i=0;i<this.size;i++){
            str += this.ar[i];
            if(i < this.size - 1){
                str += ", ";
            }
        }
        
        str += " ]";
        
        return str;
    }
    
    

    public static void main(String[] args) {
        ArrayEx test = new ArrayEx(2);
        
        test.add(1);
        test.add(2);
        
        test.remove(0);

        System.out.println(test);
    }
}
