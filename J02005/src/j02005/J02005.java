/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02005;


import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J02005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet <Short> setA = new TreeSet <Short>();
        TreeSet <Short> setB = new TreeSet <Short>();
        byte n = sc.nextByte(), m = sc.nextByte();
        for(byte i=0; i<n; i++){
            setA.add(sc.nextShort());
        }
        for(byte i=0; i<m; i++){
            setB.add(sc.nextShort());
        }
        setA.retainAll(setB);
        for(short ele:setA){
            System.out.print(ele + " ");
        }
    }
    
}
