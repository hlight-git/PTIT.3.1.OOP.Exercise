/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn29;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            Map <Character, Integer> map = new HashMap<>();
            Queue <Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
                
            });
            int k = Integer.parseInt(sc.nextLine());
            String line = sc.nextLine();
            if(k >= line.length()){
                System.out.println(0);
                continue;
            }
            for(char ele:line.toCharArray()){
                if(map.containsKey(ele)){
                    map.put(ele, map.get(ele) + 1);
                }
                else{
                    map.put(ele, 1);
                }
            }
            for(char ele:map.keySet()){
                pq.offer(map.get(ele));
            }
            while(k-- >0){
                pq.offer(pq.poll()-1);
            }
            long ans = 0;
            for(int ele:pq){
                ans += (long)ele*ele;
            }
            System.out.println(ans);
        }
    }
    
}
