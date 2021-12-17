/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02022;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02022 {

    /**
     * @param args the command line arguments
     */
    public static void Generate(String ans, byte len, boolean... seen){
        if(ans.length() == len){
            System.out.println(ans);
            return;
        }
        for(byte i=1; i<=len; i++){
            if(!seen[i] && (ans.isEmpty() || Math.abs(i - (ans.charAt(ans.length()-1) - '0')) > 1)){
                seen[i] = true;
                Generate(ans + i, len, seen);
                seen[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            boolean[] seen = new boolean[11];
            Arrays.fill(seen, false);
            Generate("", sc.nextByte(), seen);
        }
    }
    
}
