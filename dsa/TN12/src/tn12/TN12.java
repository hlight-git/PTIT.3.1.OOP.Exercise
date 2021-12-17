/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn12;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN12 {

    static int pos[] = new int[100];
    public static int diff(int n, int k){
        boolean tmp[] = new boolean[100];
        for(int i=0; i<k; i++){
            tmp[pos[i]] = true;
        }
        int i = (int) (k-1);
        while(i >= 0 && pos[i] == n-k+i+1){
            --i;
        }
        if(i == -1){
            return k;
        }
        ++pos[i];
        for(int j=1; i+j<k; j++){
            pos[i+j] = (int) (pos[i] + j);
        }
        int cnt = 0;
        for(int j=0; j<k; j++){
            if(!tmp[pos[j]])
                ++cnt;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i=0; i<k; i++){
                pos[i] = sc.nextInt();
            }
            System.out.println(diff(n, k));
        }
    }
    
}
