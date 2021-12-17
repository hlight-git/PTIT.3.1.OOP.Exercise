/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03010;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> emails = new HashMap <String, Integer>();
        short test = sc.nextShort();
        sc.nextLine();
        while(test-- >0){
            Person p = new Person(sc.nextLine(), emails);
            System.out.println(p.getEmailName() + "@ptit.edu.vn");
        }
    }
    
}
