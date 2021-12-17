/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03032;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class J03032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            while(st.hasMoreTokens()){
                System.out.print(new StringBuilder(st.nextToken()).reverse().toString() + " ");
            }
            System.out.println();
        }
    }
    
}
