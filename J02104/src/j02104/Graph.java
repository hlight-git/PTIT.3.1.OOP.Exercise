/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02104;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Graph {
    private int numOfVertex;
    public ArrayList < ArrayList <Integer> > adjacentList;
    
    Graph(int V){
        numOfVertex = V;
    }
    public int getV(){
        return numOfVertex;
    }
    public void init(Scanner sc){
        adjacentList = new ArrayList < ArrayList <Integer> >();
        adjacentList.add(new ArrayList <Integer>());
        for(int i=1; i<=numOfVertex; i++){
            ArrayList <Integer> tmp = new ArrayList <Integer>();
            for(int j=1; j<=numOfVertex; j++){
                if(sc.nextByte() == 1 && i<j){
                    tmp.add(j);
                }
            }
            adjacentList.add(tmp);
        }
    }
    public ArrayList < ArrayList <Integer> > getAdjacentList(){
        return adjacentList;
    }
}
