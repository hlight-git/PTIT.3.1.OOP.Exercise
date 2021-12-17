/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02006;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J02006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <Short> set = new TreeSet<Short>();
        short n = sc.nextByte();
        short m = sc.nextByte();
        for(short i=0; i<n + m; i++){
            set.add(sc.nextShort());
        }
        for(short ele:set){
            System.out.print(ele + " ");
        }
    }
    
}
