/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08012;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UndirectedGraph {
    private int numOfVertexs;
    private LinkedList <Integer> edges[];
    private int[] counterForStarGraph;
    public UndirectedGraph(int numOfVertexs) {
        this.numOfVertexs = numOfVertexs;
//        this.edges = new LinkedList[numOfVertexs+1];
//        for(int i=0; i<=numOfVertexs; i++)
//            edges[i] = new LinkedList();
        this.counterForStarGraph = new int[4];
    }
//    void addEdges(int u, int v){
//        edges[u].add(v);
//        edges[v].add(u);
//    }
//    public void initGraph(Scanner sc){
//        for(int i=0; i<numOfVertexs-1; i++){
////            addEdges(sc.nextInt(), sc.nextInt());
//            counterForStarGraph[sc.nextInt()]++;
//            counterForStarGraph[sc.nextInt()]++;
//        }
//    }
    public boolean initStarGraph(Scanner sc){
        if(numOfVertexs == 1 || numOfVertexs == 2){
            return true;
        }
        int x, y, cnt = 2, base = 0;
        counterForStarGraph[0] = sc.nextInt();
        counterForStarGraph[1] = sc.nextInt();
        counterForStarGraph[2] = sc.nextInt();
        counterForStarGraph[3] = sc.nextInt();
        for(int i=0; i<4; i++){
            for(int j=1; j<4; j++){
                if(counterForStarGraph[i] == counterForStarGraph[j]){
                    base = counterForStarGraph[i];
                    break;
                }
            }
            if(base != 0)
                break;
        }
        for(int i=2; i<numOfVertexs-1; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == base || y == base){
                cnt++;
            }
        }
        if(base != 0 && cnt == numOfVertexs-1){
            return true;
        }
        return false;
    }
//    public boolean isStarGraph(){
////        for(LinkedList ele:edges){
////            if(ele.size() == numOfVertexs-1){
////                return true;
////            }
////        }
//        for(int i:counterForStarGraph){
//            if(i == numOfVertexs-1){
//                return true;
//            }
//        }
//        return false;
//    }
    
}
