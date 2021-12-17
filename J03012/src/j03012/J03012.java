/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03012;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = Byte.parseByte(sc.nextLine());
        while(test-- >0){
            System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        }
    }
    
}
