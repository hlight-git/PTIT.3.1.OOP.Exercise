/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiacatdothi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Chiacatdothi {

    static class Graph{
        private int V;
        private LinkedList<Integer>[] adj;
        ArrayList<ArrayList<Integer> > components
            = new ArrayList<>();
        public Graph(int v){
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adj[i] = new LinkedList();
        }
        public void addEdge(int u, int w){
            adj[u].add(w);
            adj[w].add(u);
        }
        public void DFSUtil(int v, boolean[] visited, ArrayList<Integer> al){
            visited[v] = true;
            al.add(v);
            Iterator<Integer> it = adj[v].iterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n])
                    DFSUtil(n, visited, al);
            }
        }

        public void DFS(){
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                ArrayList<Integer> al = new ArrayList<>();
                if (!visited[i]) {
                    DFSUtil(i, visited, al);
                    components.add(al);
                }
            }
        }
        public int ConnecetedComponents() { return components.size(); }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        while(test-- >0){
//            int V = sc.nextInt(), E = sc.nextInt();
//            Graph g = new Graph(V);
//            int[] tmp1 = new int[E];
//            int[] tmp2 = new int[E];
//            for(int i=0; i<E; i++){
//                tmp1[i] = sc.nextInt();
//                tmp2[i] = sc.nextInt();
//                g.addEdge(tmp1[i]-1, tmp2[i]-1);
//            }
//            g.DFS();
//            int init = g.ConnecetedComponents();
//            int ans = init;
//            for(int i=0; i<V; i++){
//                Graph g2 = new Graph(V);
//                for(int j=0; j<E; j++){
//                    if(tmp1[j] == i || tmp2[j] == i)
//                        continue;
//                    g2.addEdge(tmp1[j]-1, tmp2[j]-1);
//                }
//                g2.DFS();
//                if(ans < g2.ConnecetedComponents() -1){
//                    ans = g2.ConnecetedComponents() -1;
//                }
//            }
//            if(ans == init){
//                System.out.println("0");
//            }
//            else{
//                System.out.println(ans);
//            }
//        }
    }
    
}
