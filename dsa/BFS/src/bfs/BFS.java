/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BFS {

    static void BFS(int V, int u, ArrayList <Integer>[] edges){
        boolean seen[] = new boolean[V+1];
        LinkedList <Integer> q = new LinkedList <>();
        seen[u] = true;
        q.add(u);
        System.out.print(u);
        while(!q.isEmpty()){
            int v = q.poll();
            for(int ele:edges[v]){
                if(!seen[ele]){
                    System.out.print(" -> " + ele);
                    seen[ele] = true;
                    q.add(ele);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int V = sc.nextInt();
            int E = sc.nextInt();
            int u = sc.nextInt();
            ArrayList <Integer>[] edges = new ArrayList[V+1];
            for(int i=0; i<V+1; i++){
                edges[i] = new ArrayList<Integer>();
            }
            for(int i=0; i<E; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                edges[x].add(y);
                edges[y].add(x);
            }
            System.out.print("BFS(" + u + ")= ");
            BFS(V, u, edges);
        }
    }
    
}
