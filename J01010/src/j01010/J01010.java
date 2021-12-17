/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01010;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01010 {

    /**
     * @param args the command line arguments
     */
    public static String hash(String num){
        String res = "";
        for(char ele:num.toCharArray()){
            switch(ele){
                case '0': case '8': case '9':
                    res += '0';
                    break;
                case '1':
                    res += '1';
                    break;
                default:
                    return "INVALID";
            }
        }
        if(Long.parseLong(res) == 0){
            return "INVALID";
        }
        return String.valueOf(Long.parseLong(res));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short test = Short.parseShort(sc.nextLine());
        while(test-- >0){
            System.out.println(hash(sc.nextLine()));
        }
    }
    
}
