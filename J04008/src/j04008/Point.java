/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04008;

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
    public boolean isValidTriangle(Point p1, Point p2){
        double d1 = distance(p1);
        double d2 = distance(p2);
        double d3 = distance(p1, p2);
        return d1 + d2 > d3 && d2 + d3 > d1 && d1 + d3 > d2;
    }
    public double area(Point p1, Point p2){
        double d1 = distance(p1);
        double d2 = distance(p2);
        double d3 = distance(p1, p2);
        double p = (d1 + d2 + d3)/2;
        return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
    }
    public double perimeter(Point p1, Point p2){
        return distance(p1) + distance(p2) + distance(p1, p2);
    }
    
    @Override
    public String toString() {
        return "some string...";
    }
}
