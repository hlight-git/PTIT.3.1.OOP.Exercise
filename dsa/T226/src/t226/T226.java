/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t226;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class T226 {

    static int QueueAndDP(int s, int t){
        if(s >= t)  return  s - t;
        Queue <Integer> q = new LinkedList<>();
        int step[] = new int[20001];
        q.offer(s);
        while(step[t] == 0){
            int top = q.poll();
            if(top - 1 > 0 && step[top - 1] == 0){
                step[top - 1] = step[top] + 1;
                q.offer(top - 1);
            }
            if(top << 1 < 20000 && step[top << 1] == 0){
                step[top << 1] = step[top] + 1;
                q.offer(top << 1);
            }
        }
        return step[t];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            System.out.println(QueueAndDP(sc.nextInt(), sc.nextInt()));
        }
    }
    
}
