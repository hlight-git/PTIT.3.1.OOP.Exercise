/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t215;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T215 {

    /**
     * @param args the command line arguments
     */
    static boolean isOperator(char x){
        return x == '*' || x == '/' || x == '+' || x == '-';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = sc.nextLine();
            Stack <String> s = new Stack<>();
            for(char ele:line.toCharArray()){
                if(isOperator(ele)){
                    String tmp = s.pop();
                    s.push(ele + s.pop() + tmp);
                }
                else{
                    s.push(ele + "");
                }
            }
            for(String ele:s){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
    
}
