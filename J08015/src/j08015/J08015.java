/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08015;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class J08015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            Set <Integer> set = new HashSet<Integer>();
            Map <Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<n; i++){
                int inp = sc.nextInt();
                set.add(inp);
                if(map.containsKey(inp)){
                    map.put(inp, map.get(inp) + 1);
                }
                else{
                    map.put(inp, 1);
                }
            }
            long ans = 0;
            for(int ele:set){
                int tmp = (int) (k - ele);
                if(map.containsKey(ele) && map.containsKey(tmp)){
                    if(ele == tmp){
                        ans += (long)map.get(ele) * (map.get(ele) - 1) / 2;
                    }
                    else{
                        ans += (long)map.get(ele) * map.get(tmp);
                    }
                    map.remove(tmp);
                }
            }
            System.out.println(ans);
        }
    }
    
}
