/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN10 {

    static boolean next_permutation(int[] arr) {
	int len = arr.length;
	int i = len - 1;
	while (i > 0) {
            if (arr[i - 1] < arr[i]) break;
            i--;
  	}
  	if (i <= 0) return false;
  	int j = len - 1;
  	while (j >= i) {
            if (arr[i - 1] < arr[j]) break;
            j--;
  	}
  	swap(i - 1, j, arr);
  	len--;
  	while (i < len) {
            swap(i, len, arr);
            len--;
            i++;
  	}
  	return true;
    }

    static void swap(int x, int y, int[] arr) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            int[] arr = new int[sc.nextInt()];
            for(int i=0; i<arr.length; i++)
                arr[i] = i+1;
            for(int ele:arr){
                System.out.print(arr.length - ele + 1);
            }
            System.out.print(" ");
            while(next_permutation(arr)){
                for(int ele:arr){
                    System.out.print(arr.length - ele + 1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
