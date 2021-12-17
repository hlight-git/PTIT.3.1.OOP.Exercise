/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03021;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03021 {

    /**
     * @param args the command line arguments
     */
    public static byte convert(char x){
        if(x > 'R'){
            switch(x){
                case 'S':   return 7;
                case 'T': case 'U': case 'V': return 8;
                case 'W': case 'X': case 'Y': case 'Z': return 9;
            }
        }
        return (byte) ((x - 'A')/3 + 2);
    }
    public static String convertedString(String text){
        String res = "";
        text = text.toUpperCase();
        for(char x:text.toCharArray()){
            res += convert(x);
        }
        return res;
    }
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short test = Short.parseShort(sc.nextLine());
        while(test-- >0){
            if(isPalindrome(convertedString(sc.nextLine()))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
