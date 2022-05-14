/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package summer;

/**
 *
 * @author ratchanon
 */
public class SumRecursion {

    public long power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public long getSum(int m, int n) {
        if (n == 1) {
            return m;
        }

        if (n == 0) {
            return 1;
        }

        return power(m, n) + getSum(m - 1, n - 2);
    }

}
