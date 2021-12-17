/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03011;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            long n = sc.nextLong();
            BigNum m = new BigNum(sc.next());
            System.out.println(m.GCDwith(n));
        }
    }
    
}
