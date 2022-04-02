/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11q2s6434480323;

import java.awt.Point;

/**
 *
 * @author ratchanon
 */
public abstract class Quadrilateral {

    private Point a, b, c, d;

    public Quadrilateral(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3,
            int x4, int y4
    ) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }

    /* จงเขียน method getSortedDist () */
    public double[] getSortedDist() {
        double[] dis = new double[6];

        dis[0] = a.distance(b);
        dis[1] = a.distance(c);
        dis[2] = a.distance(d);
        dis[3] = b.distance(c);
        dis[4] = b.distance(d);
        dis[5] = c.distance(d);

        // Do a sorting
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i - 1; j++) {
                if (dis[j] > dis[j + 1]) {
                    double temp = dis[j];
                    dis[j] = dis[j + 1];
                    dis[j + 1] = temp;
                }
            }
        }

        return dis;
    }

    /* จง override toString() เพื่อให้แสดงผลลัพธ์เป็นจุด (x,y) ของจุดมุมทั้ง 4 จุด */
    @Override
    public String toString() {
        return a + "\n" + b + "\n" + c + "\n" + d;

    }

    /* จงเขียน abstract method area ซึ่งคืนค่าชนิด double */
    public abstract double area();
}
