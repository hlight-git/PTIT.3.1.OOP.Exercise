/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03027;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class J03027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack <Character> s = new Stack<Character>();
        for(char ele:str.toCharArray()){
            if(s.empty()|| ele != s.peek()){
                s.push(ele);
            }
            else{
                s.pop();
            }
        }
        if(s.empty()){
            System.out.println("Empty String");
        }
        else{
            for(char ele:s){
                System.out.print(ele);
            }
        }
    }
    
}
