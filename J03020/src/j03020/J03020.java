/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03020;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03020 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> map = new LinkedHashMap<String, Integer>();
        String str;
        while(sc.hasNext()){
            str = sc.next();
            if(isPalindrome(str)){
                if(map.containsKey(str))
                    map.put(str, map.get(str) + 1);
                else
                    map.put(str, 1);
            }
        }
        int len = 0;
        for(Entry<String, Integer> entry:map.entrySet()){
            if(entry.getKey().length() > len){
                len = entry.getKey().length();
            }
        }
        for(Entry<String, Integer> entry:map.entrySet()){
            if(entry.getKey().length() == len){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
    
}
