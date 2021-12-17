/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04004;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction b = new Fraction(sc.nextInt(), sc.nextInt());
        System.out.println(a.sum(b));
    }
    
}
