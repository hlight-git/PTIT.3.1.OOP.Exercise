/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03006;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03006 {

    /**
     * @param args the command line arguments
     */
    public static boolean isValid(String num){
        for(int i=0, j=num.length()-1; i < j; i++, j--){
            if((num.charAt(i) - '0') % 2 == 1){
                return false;
            }
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String string = sc.next();
            if(isValid(string)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
