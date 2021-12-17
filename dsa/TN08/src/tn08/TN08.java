/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn08;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class TN08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String bin = sc.nextLine();
            int i=bin.length()-1;
            while(i >= 0 && bin.charAt(i) == '1'){
                i--;
            }
            if(i == -1){
                for(; i<bin.length()-1; i++)
                    System.out.print(0);
                System.out.println();
            }
            else{
                System.out.print(bin.substring(0, i));
                System.out.print(1);
                for(i = i+1; i<bin.length(); i++)
                    System.out.print(0);
                System.out.println();
            }
        }
    }
    
}
