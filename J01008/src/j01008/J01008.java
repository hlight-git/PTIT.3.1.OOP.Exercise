/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01008;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J01008 {

    /**
     * @param args the command line arguments
     */
    public static void Analyze(long n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                int exp = 0;
                while(n%i == 0){
                    ++exp;
                    n /= i;
                }
                System.out.print(" " + i + "(" + exp + ")");
            }
        }
        if(n > 1)
            System.out.print(" " + n + "(1)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; ++t){
            long n = sc.nextLong();
            System.out.print("Test " + t + ":");
            Analyze(n);
            System.out.println();
        }
    }
    
}
