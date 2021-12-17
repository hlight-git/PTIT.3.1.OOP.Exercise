/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01012;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            int n;
            n = sc.nextInt();
            int ans = 1 - n%2;
            for(int i=2; i*i <= n; i++){
                if(n % i == 0){
                    if(i % 2 == 0)
                        ++ans;
                    if(n/i % 2 == 0 && i*i != n)
                        ++ans;
                }
            }
            System.out.println(ans);
        }
    }
    
}
