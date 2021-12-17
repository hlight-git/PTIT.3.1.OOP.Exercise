/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short test = sc.nextShort();
        sc.nextLine();
        while(test-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            ArrayList <String> list = new ArrayList<String>();
            for(String s:s2.split(" ")){
                if(s.length() > 0){
                    list.add(s);
                }
            }
            HashSet <String> set = new HashSet<String>();
            for(String s:s1.split(" ")){
                if(s.length() > 0 && !list.contains(s)){
                    set.add(s);
                }
            }
            for(String s:set){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
    
}
