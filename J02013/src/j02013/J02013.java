/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02013;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        for(int i=n-1; i>=0; i--){
            boolean swap = false;
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    swap = true;
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
            }
            if(!swap)   return;
            System.out.print("Buoc " + (cnt++) + ":");
            for(int j=0; j<n; j++){
                System.out.print(" " + arr[j]);
            }
            System.out.println();
        }
    }
    
}
