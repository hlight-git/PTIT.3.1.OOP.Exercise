/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanlientiep;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class DoanLienTiep {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int arr[] = new int[sc.nextInt()];
            int res[] = new int[arr.length];
            for(int i=arr.length-1; i>=0; i--){
                arr[i] = sc.nextInt();
            }
            Stack <Integer> s = new Stack<>();
            s.push(0);
            for(int i=1; i<arr.length; i++){
                while(!s.empty() && arr[i] > arr[s.peek()]){
                    res[s.peek()] = i - s.pop();
                }
                s.push(i);
            }
            for(int ele:s){
                res[ele] = arr.length - ele;
            }
            for(int i=res.length-1; i>=0; i--){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
    
}
