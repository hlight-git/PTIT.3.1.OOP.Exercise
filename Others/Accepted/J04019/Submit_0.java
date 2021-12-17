/*
	Run time: 0.41s
	Memory: 32444Kb
*/
import java.util.*;

public class main {

    public static class Point {

        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public static Point nextPoint(Scanner sc) {
            return new Point(sc.nextDouble(), sc.nextDouble());
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distance(Point p) {
            return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        }
    }

    public static class Triangle {

        private Point p1, p2, p3;

        public Triangle(Point p1, Point p2, Point p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public boolean valid() {
            if (p1.getY() == p2.getY() && p1.getY() == p3.getY() || p1.getX() == p2.getX() && p1.getX() == p3.getX()) {
                return false;
            }
            if ((p1.getX() - p2.getX()) / (p1.getY() - p2.getY()) == (p2.getX() - p3.getX()) / (p2.getY() - p3.getY())) {
                return false;
            }
            return true;
        }

        public double getPerimeter() {
            return Math.round((p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) * 1000) / 1000.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main3267011(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main155645(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }

}

