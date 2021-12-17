/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04008;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            if(p1.isValidTriangle(p2, p3)){
                System.out.printf("%.3f\n", p1.perimeter(p2, p3));
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
    
}
