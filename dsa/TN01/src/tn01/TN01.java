/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN01 {

    /**
     * @param args the command line arguments
     */
    static long f[] = new long[100];
    static void DP(){
        f[1] = 1;
        f[2] = 1;
        for(int i=3; i<93; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        DP();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            System.out.println(f[sc.nextInt()]);
        }
    }
    
}
