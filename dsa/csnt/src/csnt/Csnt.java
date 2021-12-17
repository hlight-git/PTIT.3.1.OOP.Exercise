/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class Csnt {

    static int nt[] = {2, 3, 5, 7};
    static int n;
    static ArrayList<Long> arr;
    static boolean isValid(String s){
        if(s.length() > n)
            return false;
        if(s.charAt(s.length()-1) == '2')
            return false;
        boolean check[] = {true, true, true, true};
        for(char ele:s.toCharArray()){
            if(ele == '2')
                check[0] = false;
            else if(ele == '3')
                check[1] = false;
            else if(ele == '5')
                check[2] = false;
            else
                check[3] = false;
        }
        for(int i=0; i<4; i++)
            if(check[i])
                return false;
        return true;
    }
    static void Try(String tmp){
        if(tmp.length() > n)
            return;
        for(int i=0; i<4; i++){
            if(isValid(tmp + nt[i]))
                arr.add(Long.parseLong(tmp + nt[i]));
            Try(tmp + nt[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new ArrayList<>();
        Try("");
        Collections.sort(arr);
        for(Long ele:arr){
            System.out.println(ele);
        }
    }
    
}
