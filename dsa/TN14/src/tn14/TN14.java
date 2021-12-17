/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn14;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            Queue <Long> pq = new PriorityQueue<>();
            long n = sc.nextLong();
            final long MOD = (int) (1e9 + 7);
            for(int i=0; i<n; i++){
                pq.offer(sc.nextLong());
            }
            long res = 0;
            while(pq.size() != 1){
                n = pq.poll() + pq.poll();
                n %= MOD;
                res += n;
                res %= MOD;
                pq.offer(n);
            }
            System.out.println(res);
        }
    }
    
}
