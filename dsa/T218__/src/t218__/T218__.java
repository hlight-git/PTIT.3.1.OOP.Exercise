/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t218__;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T218__ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int arr[] = new int[sc.nextInt()];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            Stack <Integer> s = new Stack<>();
            s.push(0);
            for(int i=1; i<arr.length; i++){
                while(!s.empty() && arr[i] > arr[s.peek()]){
                    arr[s.pop()] = arr[i];
                }
                s.push(i);
            }
            for(int ele:s){
                arr[ele] = -1;
            }
            for(int ele:arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
}
