/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04015;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher tc = new Teacher(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        System.out.println(tc);
    }
    
}
