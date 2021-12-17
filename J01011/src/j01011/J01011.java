/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01011;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            int first, second;
            first = sc.nextInt();
            second = sc.nextInt();
            Pair pair = new Pair(first, second);
            System.out.println(pair.LCM() + " " + pair.GCD());
        }
    }
    
}
