/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01009;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        long sum = 1, base = 1;
        for(byte i=2; i<=n; i++){
            base *= i;
            sum += base;
        }
        System.out.println(sum);
    }
    
}
