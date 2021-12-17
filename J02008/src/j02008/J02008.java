/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02008;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02008 {

    /**
     * @param args the command line arguments
     */
    static boolean notPrime[] = new boolean[43];
    static long dp[] = new long[43];
    public static void main(String[] args) {
        sieve();
        DP();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            byte n = sc.nextByte();
            System.out.println(dp[n]);
        }
    }
    public static void sieve(){
        notPrime[0] = true;
        notPrime[1] = true;
        for(int i=2; i<6; i++){
            if(i != 4){
                for(int j=2*i; j<43; j+=i){
                    notPrime[j] = true;
                }
            }
        }
    }
    public static void DP(){
        dp[1] = 1;
        int two = 2;
        int three = 3;
        int five = 5;
        for(int i=2; i<43; i++){
            int change = 1;
            if(i == two){
                change *= 2;
                two *= 2;
            }
            else if(i == three){
                change *= 3;
                three *= 3;
            }
            else if(i == five){
                change *= 5;
                five *= 5;
            }
            else if(!notPrime[i]){
                change *= i;
            }
            dp[i] = dp[i-1] * change;
        }
    }
}
