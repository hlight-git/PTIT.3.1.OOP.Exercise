/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t221;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class T221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Queue <String> q = new LinkedList<>();
        List <String> l = new ArrayList<>();
        q.offer("1");
        while(test-- >0){
            int n = sc.nextInt();
            while(l.size() < n){
                String tmp = q.poll();
                l.add(tmp);
                q.offer(tmp + "0");
                q.offer(tmp + "1");
            }
            for(int i=0; i<n; i++){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
    
}
