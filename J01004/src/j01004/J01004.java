/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01004;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J01004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int test;
        test = inp.nextInt();
        while(test-- >0){
            long n = inp.nextLong();
            if(isPrime(n))  System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean isPrime(long number){
        if(number < 2)  return false;
        for(int i=2; i*i<=number; i++)
            if(number % i == 0)  return false;
        return true;
    }
}
