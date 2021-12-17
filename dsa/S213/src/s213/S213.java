/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s213;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class S213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Queue <String> q = new LinkedList<>();
        List <String> l = new ArrayList<>();
        q.offer("6");
        q.offer("8");
        while(test-- >0){
            int n = sc.nextInt();
            while(l.isEmpty() || l.get(l.size()-1).length() <= n){
                String tmp = q.poll();
                l.add(tmp);
                q.offer(tmp + "6");
                q.offer(tmp + "8");
            }
            System.out.println((int) (2*(Math.pow(2, n) - 1)));
            for(int i=(int) (2*(Math.pow(2, n) - 1) - 1); i>=0; i--){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
    
}
