/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4q3s6434480323;

/**
 *
 * @author ratchanon
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point another){
        double distance = Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2));
        return distance;
    }
    
    public void translate(double distanceX, double distanceY){
        x += distanceX;
        y += distanceY;
    }
    
    public boolean equals(Point other){
        return x == other.x && y == other.y;
    }
    
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
