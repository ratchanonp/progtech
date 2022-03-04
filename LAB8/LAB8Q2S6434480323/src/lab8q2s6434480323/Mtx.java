/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q2s6434480323;

/**
 *
 * @author ratchanon
 */
public class Mtx {

    private int row;
    private int column;
    private int[][] Matrix;

    public Mtx(int[][] Matrix) {
        this.row = Matrix.length;
        this.column = Matrix[0].length;

        this.Matrix = Matrix;
    }

    /* Getter */
    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int[][] getMatrix() {
        return this.Matrix;
    }

    public boolean equalSize(Mtx that) {
        return this.row == that.row && this.column == that.column;
    }

    public boolean compatible(Mtx that) {
        return this.column == that.row;
    }

    public int[][] add(Mtx that) {
        int[][] result = new int[this.row][this.column];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                result[i][j] = this.Matrix[i][j] + that.Matrix[i][j];
            }
        }

        return result;
    }

    public int[][] mul(Mtx that) {
        int[][] result = new int[this.row][that.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < that.column; j++) {
                for (int k = 0; k < that.row; k++) {
                    result[i][j] += this.Matrix[i][k] * that.Matrix[k][j];
                }
            }
        }
        return result;
    }

    public int[][] mul(int n) {
        int[][] result = new int[this.row][this.column];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                result[i][j] = this.Matrix[i][j] * n;
            }
        }

        return result;
    }
    
     public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /* 
        Testing 
        if you didn't test, it doesn't have bug. 
        - Q
     */
    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] mat2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        Mtx obj_mat1 = new Mtx(mat1);
        Mtx obj_mat2 = new Mtx(mat2);

        System.out.println("===== Matrix 1 =====");
        System.out.println("Row: " + obj_mat1.getRow() + "\tCol: " + obj_mat1.getColumn());

        System.out.println("===== Matrix 2 =====");
        System.out.println("Row: " + obj_mat2.getRow() + "\tCol: " + obj_mat2.getColumn());

        System.out.println("\n===== Checking =====");
        System.out.println("Check equalSize : " + obj_mat1.equalSize(obj_mat2));
        System.out.println("Check compatible : " + obj_mat1.compatible(obj_mat2));

        System.out.println("\n===== Operation =====");
        int[][] resultAdd = obj_mat1.add(obj_mat2);
        for (int i = 0; i < resultAdd.length; i++) {
            for (int j = 0; j < resultAdd[i].length; j++) {
                System.out.print(resultAdd[i][j] + " ");
            }
            System.out.println("");
        }

        if (obj_mat1.equalSize(obj_mat2)) {

            int[][] resultMul = obj_mat1.mul(obj_mat2);
            for (int i = 0; i < resultMul.length; i++) {
                for (int j = 0; j < resultMul[i].length; j++) {
                    System.out.print(resultMul[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Not Equal Size");
        }

        if (obj_mat1.compatible(obj_mat2)) {

            int[][] resultMul2 = obj_mat1.mul(2);
            for (int i = 0; i < resultMul2.length; i++) {
                for (int j = 0; j < resultMul2[i].length; j++) {
                    System.out.print(resultMul2[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Not Compatible");
        }
    }
}
