/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04001;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            System.out.printf("%.4f\n", new Point(sc.nextDouble(), sc.nextDouble()).distance(new Point(sc.nextDouble(), sc.nextDouble())));
        }
    }
    
}
