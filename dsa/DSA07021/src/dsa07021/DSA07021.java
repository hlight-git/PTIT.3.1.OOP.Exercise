/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa07021;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class DSA07021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            String line = sc.nextLine();
            int res = 0;
            Stack <Integer> s = new Stack<>();
            s.push(-1);
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i) == ')'){
                    s.pop();
                    if(s.empty()){
                        s.push(i);
                    }
                    else{
                        res = Math.max(res, i-s.peek());
                    }
                }
                else{
                    s.push(i);
                }
            }
            System.out.println(res);
        }
    }
    
}
