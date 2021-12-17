/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class IntegerHandle {
    private int[] arr;
    private boolean check;
    
    public IntegerHandle(int size){
        arr = new int[size];
        check = false;
    }

    public boolean isCheck() {
        return check;
    }
    
    public void init(Scanner sc){
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(sc.nextLine());
    }
    
    public void printMinUnsignValue(){
        int res = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < res && arr[i] > 0){
                res = arr[i];
            }
        }
        if(res < 0){
            System.out.println("Không có số nào trong dãy là số không âm.");
        }
        System.out.println("Số nhỏ nhất không âm trong dãy: " + res);
    }
    
    public void printRevSortedSubArr(){
        int tmp[] = new int[arr.length - 3];
        for(int i=2; i<arr.length - 1; i++){
            tmp[i-2] = arr[i];
        }
        Arrays.sort(tmp);
        for(int i=tmp.length-1; i>=0; i--){
            System.out.print(tmp[i] + " ");
        }
        System.out.println();
    }
    public void calSubArrWithSumEqualToK(int K, int start, int sum, String res){
        for(int i=start; i<arr.length; i++){
            if(K == sum + arr[i]){
                System.out.println(res + " " + arr[i]);
                check = true;
            }
            else if(K > sum + arr[i]){
                calSubArrWithSumEqualToK(K, start+1, sum + arr[i], res + " " + arr[i]);
            }
        }
    }
}
