/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List <Integer> list = new ArrayList<Integer>();
//        for(int i=0; i<n; i++){
//            list.add(arr[i]);
//            System.out.print("Buoc " + i + ":");
//            Collections.sort(list);
//            for(int val:list){
//                System.out.print(" " + val);
//            }
//            System.out.println();
//        }
        for(int i=0; i<n; i++){
            System.out.print("Buoc " + i + ":");
            int pos = 0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j) > arr[i]){
                    break;
                }
                ++pos;
            }
            list.add(pos, arr[i]);
            for(int val:list){
                System.out.print(" " + val);
            }
            System.out.println();
        }
    }
    
}
