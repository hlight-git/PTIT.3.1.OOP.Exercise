/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn06;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class TN06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> map = new HashMap <String, Integer>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            StringTokenizer st = new StringTokenizer(sc.nextLine().toLowerCase());
            String tail = "";
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                if(st.hasMoreTokens())
                    tail += tmp.charAt(0);
                else{
                    tmp = tmp + tail;
                    if(map.containsKey(tmp)){
                        map.put(tmp, map.get(tmp) + 1);
                        System.out.print(tmp + map.get(tmp));
                    }
                    else{
                        map.put(tmp, 1);
                        System.out.print(tmp);
                    }
                }
            }
            System.out.println("@ptit.edu.vn");
        }
    }
    
}
