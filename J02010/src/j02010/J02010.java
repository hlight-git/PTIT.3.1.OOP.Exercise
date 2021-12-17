/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02010;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J02010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    arr[i] ^= arr[j];
                    arr[j] ^= arr[i];
                    arr[i] ^= arr[j];
                }
            }
            System.out.print("Buoc " + (i+1) + ":");
            for(int j=0; j<n; j++){
                System.out.print(" " + arr[j]);
            }
            System.out.println();
        }
    }
    
}
