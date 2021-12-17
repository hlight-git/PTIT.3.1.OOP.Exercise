/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02104;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(sc.nextInt());
        g.init(sc);
        for(int i=1; i<=g.getV(); i++){
            for(int j:g.adjacentList.get(i)){
                System.out.println("(" + i + "," + j + ")");
            }
        }
    }
    
}
