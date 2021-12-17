/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02016 {

    /**
     * @param args the command line arguments
     */
    static boolean havePytagoTrio(HashSet <Long> set, ArrayList <Long> list){
        long max = list.get(list.size() - 1);
        int cap = list.size();
        for(int i=0; i<cap; i++){
            for(int j=i+1; j<cap; j++){
                long expected = list.get(i) + list.get(j);
                if(expected > max){
                    break;
                }
                if(set.contains(expected)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            HashSet <Long> set = new HashSet <Long>();
            int cap = sc.nextInt();
            for(int i=0; i<cap; i++){
                long tmp = sc.nextLong();
                set.add(tmp*tmp);
            }
            ArrayList <Long> list = new ArrayList <Long>(set);
            Collections.sort(list);
            if(havePytagoTrio(set, list)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
    
}
