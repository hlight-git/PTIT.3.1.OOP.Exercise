/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03025;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            String s = sc.next();
            String res = "YES";
            boolean needAlter = false;
            for(int i=0, j=s.length()-1; i<j; i++, j--){
                if(s.charAt(i) != s.charAt(j)){
                    if(needAlter){
                        res = "NO";
                        break;
                    }
                    needAlter = true;
                }
            }
            if(!needAlter && s.length() % 2 == 0){
                res = "NO";
            }
            System.out.println(res);
        }
    }
    
}
