/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03015;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        System.out.println(num1.subtract(num2));
    }
    
}
