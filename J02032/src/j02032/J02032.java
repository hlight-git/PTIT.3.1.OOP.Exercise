/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02032 {

    /**
     * @param args the command line arguments
     */
    public static void BubbleSort(int... arr){
        ArrayList <String> res = new ArrayList <String>();
        byte step = 1;
        for(byte i=0; i<arr.length; i++){
            boolean swapped = false;
            for(byte j=0; j<arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = (int) (arr[j] + arr[j+1]);
                    arr[j+1] = (int) (arr[j] - arr[j+1]);
                    arr[j] = (int) (arr[j] - arr[j+1]);
                    swapped = true;
                }
            }
            if(swapped){
                String tmp = "Buoc " + step++ + ":";
                for(int j:arr){
                    tmp += " " + j;
                }
                res.add(tmp);
            }
        }
        Collections.reverse(res);
        for(String str:res){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextByte();
        while(test-- >0){
            byte len = sc.nextByte();
            int[] arr = new int[len];
            for(byte i=0; i<len; i++){
                arr[i] = sc.nextInt();
            }
            BubbleSort(arr);
        }
    }
    
}
