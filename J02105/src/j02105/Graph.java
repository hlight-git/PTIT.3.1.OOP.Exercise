/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Graph {
    private short numOfVertex;
    public ArrayList < ArrayList <Short> > adjacentList;
    
    Graph(short V){
        numOfVertex = V;
    }
    public short getV(){
        return numOfVertex;
    }
    public void init(Scanner sc){
        adjacentList = new ArrayList < ArrayList <Short> >();
        adjacentList.add(new ArrayList <Short>());
        for(short i=1; i<=numOfVertex; i++){
            ArrayList <Short> tmp = new ArrayList <Short>();
            for(short j=1; j<=numOfVertex; j++){
                if(sc.nextByte() == 1){
                    tmp.add(j);
                }
            }
            adjacentList.add(tmp);
        }
    }
    public ArrayList < ArrayList <Short> > getAdjacentList(){
        return adjacentList;
    }
}
