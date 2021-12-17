/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01007;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01007 {

    /**
     * @param args the command line arguments
     */
    public static long fibo[] = new long[93];
    public static void sieve(){
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i=2; i<93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
    public static boolean isFiboNumber(long num){
        for(int i=0; num >= fibo[i] && i < 92; i++)
            if(num == fibo[i])
                return true;
        return false;
    }
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            if(isFiboNumber(sc.nextLong())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
