/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04001;

/**
 *
 * @author ADMIN
 */
public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point other){
        return distance(this, other);
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }

    @Override
    public String toString() {
        return "some string...";
    }
    
}
