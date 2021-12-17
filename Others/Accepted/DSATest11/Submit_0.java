/*
	Run time: 0.31s
	Memory: 28692Kb
*/
src/j01015/J01015.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01015;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01015 {

    /**
     * @param args the command line arguments
     */
    public static boolean is3_Base(String num){
        for(char ele:num.toCharArray()){
            if(ele < '0' || ele > '2')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        short test = Short.parseShort(sc.nextLine());
        while(test-- >0){
            if(is3_Base(sc.nextLine())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}

