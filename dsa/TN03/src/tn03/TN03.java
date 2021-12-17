/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            int cnt = 0;
            for(char ele:s){
                if(ele < '0' || ele > '9')
                    System.out.print(ele);
                else
                    cnt += ele - '0';
            }
            System.out.println(cnt);
        }
    }
    
}
