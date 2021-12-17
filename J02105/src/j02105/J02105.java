/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02105;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(sc.nextShort());
        g.init(sc);
        for(short i=1; i<=g.getV(); i++){
            System.out.print("List(" + i + ") = ");
            for(short j:g.adjacentList.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
