/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn05;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class TN05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            StringTokenizer st = new StringTokenizer(sc.nextLine().toLowerCase());
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                System.out.print((char)(tmp.charAt(0)-32) + tmp.substring(1) + " ");
            }
            System.out.println();
        }
    }
    
}
