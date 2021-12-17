/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01017;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01017 {

    /**
     * @param args the command line arguments
     */
    public static boolean isValid(String num){
        for(int i=1; i<num.length()-1; i++)
            if(Math.abs(num.charAt(i) - num.charAt(i-1)) != 1 || Math.abs(num.charAt(i) - num.charAt(i+1)) != 1)
                return false;
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        short test = Short.parseShort(sc.nextLine());
        while(test-- >0){
            if(isValid(sc.nextLine())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
