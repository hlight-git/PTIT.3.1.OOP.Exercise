/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02031;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> ans = new ArrayList<String>();
        byte n = sc.nextByte();
        int arr[] = new int[n+5];
        for(byte i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(byte i=0; i<n-1; i++){
            byte minIndex = i;
            boolean swap = false;
            for(byte j=(byte) (i+1); j<n; j++){
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
            String tmp = "Buoc " + (i+1) + ":";
            for(byte j=0; j<n; j++){ 
                tmp += " " + arr[j];
            }
            ans.add(tmp);
        }
        for(byte i=(byte) (ans.size()-1); i>=0; i--){
            System.out.println(ans.get(i));
        }
    }
    
}
