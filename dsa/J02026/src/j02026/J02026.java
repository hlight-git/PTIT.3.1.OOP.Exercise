/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02026;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02026 {

    /**
     * @param args the command line arguments
     */
    public static void Try(Byte arr[], boolean bin[], byte step, byte cnt, byte K){
        bin[step] = true;
        if(step == arr.length-1){
            if(cnt+1 == K){
                for(byte i=0; i<arr.length; i++){
                    if(bin[i]){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
        else
            Try(arr, bin, (byte) (step+1), (byte) (cnt+1), K);
        bin[step] = false;
        if(step == arr.length-1){
            if(cnt == K){
                for(byte i=0; i<arr.length; i++){
                    if(bin[i]){
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
        else
            Try(arr, bin, (byte) (step+1), cnt, K);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        short test = sc.nextShort();
        while(test-- >0){
            byte N = sc.nextByte();
            byte K = sc.nextByte();
            Byte arr[] = new Byte[N];
            for(byte i=0; i<N; i++)
                arr[i] = sc.nextByte();
            Arrays.sort(arr);
            boolean bin[] = new boolean[N];
            Try(arr, bin, (byte) 0, (byte) 0, K);
        }
    }
    
}
