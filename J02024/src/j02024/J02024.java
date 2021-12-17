/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02024 {
    public static short sumOfArr(Byte arr[], boolean bin[]){
        short res = 0;
        for(byte i=0; i<arr.length; i++){
            if(bin[i])
                res += arr[i];
        }
        return res;
    }
    public static void Try(Byte arr[], boolean bin[], byte step){
        bin[step] = false;
        if(step == arr.length-1){
            if(sumOfArr(arr, bin) % 2 == 1){
                for(byte i=0; i<arr.length; i++){
                    if(bin[i]){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
        else
            Try(arr, bin, (byte) (step+1));
        bin[step] = true;
        if(step == arr.length-1){
            if(sumOfArr(arr, bin) % 2 == 1){
                for(byte i=0; i<arr.length; i++){
                    if(bin[i]){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
        else
            Try(arr, bin, (byte) (step+1));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        short test = sc.nextShort();
        while(test-- >0){
            byte N = sc.nextByte();
            Byte arr[] = new Byte[N];
            for(byte i=0; i<N; i++)
                arr[i] = sc.nextByte();
            Arrays.sort(arr, Collections.reverseOrder()); 
            boolean bin[] = new boolean[N];
            Try(arr, bin, (byte) 0);
        }
    }
    
}
