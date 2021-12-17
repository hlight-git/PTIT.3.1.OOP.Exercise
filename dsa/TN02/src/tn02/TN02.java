/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN02 {

    public static long maxPrimeDivisorOf(long n){
        long res = 0;
        for(int i=2; i <= Math.sqrt(n); i++){
            while(n%i == 0){
                res = i;
                n /= i;
            }
        }
        if(n > 1){
            return n;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        sc.nextLine();
        while(test-- >0){
            System.out.println(maxPrimeDivisorOf(sc.nextLong()));
        }
    }
    
}
