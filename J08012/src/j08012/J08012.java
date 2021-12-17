/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08012;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J08012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UndirectedGraph g = new UndirectedGraph(sc.nextInt());
        if(g.initStarGraph(sc)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
