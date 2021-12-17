/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tachdoitinhtong;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TachDoiTinhTong {

    static String sumOf2Part(String n){
        BigInteger head = new BigInteger(n.substring(0, n.length()/2));
        BigInteger tail = new BigInteger(n.substring(n.length()/2));
        return String.valueOf(head.add(tail));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        while(ans.length() != 1){
            ans = sumOf2Part(ans);
            System.out.println(ans);
        }
    }
    
}
