/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03024;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03024 {

    /**
     * @param args the command line arguments
     */
    public static boolean isValid(String num){
        if(num.charAt(0) == '0'){
            return false;
        }
        for(char ele:num.toCharArray()){
            if(ele < '0' || '9' < ele){
                return false;
            }
        }
        return true;
    }
    public static short typeCounter(byte type, String num){
        short cnt = 0;
        for(char ele:num.toCharArray()){
            if(ele % 2 == type){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean isAdvantageNumber(String num){
        short tmp = typeCounter((byte) (num.length() % 2), num);
        return tmp > num.length() - tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = Byte.parseByte(sc.nextLine());
        while(test-- >0){
            String num = sc.nextLine();
            if(isValid(num)){
                if(isAdvantageNumber(num)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
    
}
