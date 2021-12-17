/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03005;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short test = sc.nextShort();
        sc.nextLine();
        while(test-- >0){
            Name name = new Name(sc.nextLine());
            System.out.println(name.standardize());
        }
    }
    
}
