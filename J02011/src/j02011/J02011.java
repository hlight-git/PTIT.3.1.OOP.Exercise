/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02011;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+5];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            boolean swap = false;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                    swap = true;
                }
            }
            if(swap){
                arr[i] ^= arr[minIndex];
                arr[minIndex] ^= arr[i];
                arr[i] ^= arr[minIndex];
            }
            System.out.print("Buoc " + (i+1) + ":");
            for(int j=0; j<n; j++){ 
                System.out.print(" " + arr[j]);
            }
            System.out.println();
        }
    }
}
