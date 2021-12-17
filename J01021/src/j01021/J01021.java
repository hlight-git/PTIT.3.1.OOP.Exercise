/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01021;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01021 {

    /**
     * @param args the command line arguments
     */
    public static final long Mod = 1000000007;
    public static long power(int num, long exp){
        if(exp == 0)    return 1;
        long sqt = power(num, exp/2) % Mod;
        if(exp % 2 == 1){
            return sqt*sqt%Mod*num%Mod;
        }
        return sqt*sqt%Mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        long exp;
        while((num = sc.nextInt()) + (exp = sc.nextLong()) != 0){
            System.out.println(power(num, exp));
        }
    }
    
}
