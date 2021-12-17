/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn11;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN11 {

    static void gen(String a, int i, String tmp){
        for(; i<a.length(); i++){
            System.out.print(tmp + a.charAt(i) + " ");
            if(i != a.length()-1){
                gen(a, i+1, tmp + a.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            sc.nextLine();
            gen(sc.nextLine(), 0, "");
            System.out.println();
        }
    }
    
}
