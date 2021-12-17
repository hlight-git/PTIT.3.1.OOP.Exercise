/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestpath;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class LongestPath {

    static int V, E, u;
    static ArrayList<Integer>[] edges;
    static int parent[];
    static void DFS(){
        Stack <Integer> s = new Stack<>();
        parent[u] = -1;
        s.push(u);
        while(!s.isEmpty()){
            int v = s.pop();
            for(int ele:edges[v]){
                if(parent[ele]== 0){
                    s.push(v);
                    s.push(ele);
                    parent[ele] = v;
                    for(int e:s){
                        System.out.print(e + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            V = sc.nextInt();
            E = sc.nextInt();
            u = sc.nextInt();
            edges = new ArrayList[V+1];
            parent = new int[V+1];
            for(int i=0; i<V+1; i++){
                edges[i] = new ArrayList<Integer>();
            }
            for(int i=0; i<E; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                edges[x].add(y);
                edges[y].add(x);
            }
        }
    }
    
}
