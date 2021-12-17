/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03026;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = Byte.parseByte(sc.nextLine());
        while(test-- >0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equals(b)){
                System.out.println("-1");
            }
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
    
}
