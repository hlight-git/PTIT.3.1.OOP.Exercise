/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t210;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T210 {

    static boolean check(Stack s, char c){
        if(!s.empty() && s.pop().equals(c)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            String line = sc.nextLine();
            String res = "YES";
            Stack <Character> s = new Stack<>();
            for(char ele:line.toCharArray()){
                if(ele == ')' && !check(s, '(')){
                    res = "NO";
                    break;
                }
                else if(ele == ']' && !check(s, '[')){
                    res = "NO";
                    break;
                }
                else if(ele == '}' && !check(s, '{')){
                    res = "NO";
                    break;
                }
                else if (ele == '(' || ele == '[' || ele == '{'){
                    s.add(ele);
                }
            }
            if(!s.empty()){
                res = "NO";
            }
            System.out.println(res);
        }
    }
    
}
