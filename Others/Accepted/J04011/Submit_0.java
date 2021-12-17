/*
	Run time: 0.46s
	Memory: 64632Kb
*/
import java.util.*;



public class Main {
    
    public static class Point3D {
    
        private int x, y, z;
    
        public Point3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    
        public static int scalarProduct(Point3D p1, Point3D p2) {
            return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
        }
    
        public static Point3D createVector(Point3D p1, Point3D p2) {
            Point3D p = new Point3D(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
            return p;
        }
    
        public static Point3D vectorProduct(Point3D p1, Point3D p2) {
            Point3D p = new Point3D(p1.y * p2.z - p1.z * p2.y, p1.z * p2.x - p1.x * p2.z,
                    p1.x * p2.y - p1.y * p2.x);
            return p;
        }
    
        public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
            Point3D a = createVector(p1, p2);
            Point3D b = createVector(p1, p3);
            Point3D c = createVector(p1, p4);
            Point3D v = vectorProduct(a, b);
            if (scalarProduct(c, v) == 0) return true;
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main9751547(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main674201(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    
}

