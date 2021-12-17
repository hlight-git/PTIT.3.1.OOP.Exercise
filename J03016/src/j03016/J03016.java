/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03016;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = Byte.parseByte(sc.nextLine());
        while(test-- >0){
            BigInteger num = sc.nextBigInteger();
            if(num.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
    
}
