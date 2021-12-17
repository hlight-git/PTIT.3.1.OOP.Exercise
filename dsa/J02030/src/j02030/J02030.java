/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02030;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02030 {

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
        ArrayList <String> ans = new ArrayList<String>();
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            String res = "Buoc " + i + ":";
            int pos = 0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j) > arr[i]){
                    break;
                }
                ++pos;
            }
            list.add(pos, arr[i]);
            for(int val:list){
                res += " " + val;
            }
            ans.add(res);
        }
        for(int i=ans.size()-1; i>=0; i--){
            System.out.println(ans.get(i));
        }
    }
    
}
