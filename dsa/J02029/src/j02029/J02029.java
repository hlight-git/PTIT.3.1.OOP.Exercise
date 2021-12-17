/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02029 {

    public static void BubbleSort(int... arr){
        ArrayList <String> res = new ArrayList <String>();
        for(byte step=0; step<arr.length; step++){
            boolean swapped = false;
            for(byte j=step; j<arr.length; j++){
                if(arr[j] < arr[step]){
                    arr[j] = arr[j] + arr[step];
                    arr[step] = arr[j] - arr[step];
                    arr[j] = arr[j] - arr[step];
                    swapped = true;
                }
            }
            if(swapped){
                String tmp = "Buoc " + (step + 1) + ":";
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
