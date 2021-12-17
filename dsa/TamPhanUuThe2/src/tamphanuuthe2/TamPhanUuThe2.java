/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamphanuuthe2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TamPhanUuThe2 {

    static boolean valid(String x){
        int cnt = 0;
        for(char ele:x.toCharArray()){
            if(ele == '2'){
                cnt++;
            }
        }
        if(cnt > x.length()/2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Queue <String> q = new LinkedList<>();
        List <String> l = new ArrayList<>();
        q.offer("1");
        q.offer("2");
        while(test-- >0){
            int n = sc.nextInt();
            while(l.size() < n){
                String tmp = q.poll();
                if(valid(tmp))
                    l.add(tmp);
                q.offer(tmp + "0");
                q.offer(tmp + "1");
                q.offer(tmp + "2");
            }
            for(int i=0; i<n; i++){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
    
}
