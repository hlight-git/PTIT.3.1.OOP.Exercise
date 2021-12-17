/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03013;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short test = sc.nextShort();
        while(test-- >0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            String z = x.subtract(y).abs().toString();
            while(z.length() != Math.max(x.toString().length(), y.toString().length())){
                z = "0" + z;
            }
            System.out.println(z);
        }
    }
    
}
