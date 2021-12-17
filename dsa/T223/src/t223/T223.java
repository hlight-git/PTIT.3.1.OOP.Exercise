/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t223;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class T223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            long n = sc.nextLong();
            Queue <String> q = new LinkedList<>();
            q.offer("1");
            while(Long.parseLong(q.peek()) % n != 0){
                String tmp = q.poll();
                q.offer(tmp + "0");
                q.offer(tmp + "1");
            }
            System.out.println(q.peek());
        }
    }
    
}
