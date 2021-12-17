/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01013;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrimeDivisor pd = new PrimeDivisor();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        while(n-- >0){
            ans += pd.getVal(sc.nextInt());
        }
        System.out.println(ans);
    }
    public static long sumOfDivisor(long n){
        long res = 0;
        while(n%2 == 0){
            res += 2;
            n >>= 1;
        }
        while(n%3 == 0){
            res += 3;
            n /= 3;
        }
        for(long i=5; i*i<=n; i+=6){
            while(n%i == 0){
                res += i;
                n /= i;
            }
            while(n%(i+2) == 0){
                res += i+2;
                n /= i+2;
            }
        }
        if(n > 1){
            res += n;
        }
        return res;
    }
}
