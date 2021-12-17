/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t212;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T212 {

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
            Stack <Character> s = new Stack<>();
            String line = sc.nextLine();
            String res = "No";
            for(char ele:line.toCharArray()){
                if(ele == ')'){
                    boolean valid = false;
                    while(!s.empty() && s.peek() != '('){
                        if(isOperator(s.pop()))
                            valid = true;
                    }
                    s.pop();
                    if(!valid){
                        res = "Yes";
                        break;
                    }
                }
                else{
                    s.push(ele);
                }
            }
            System.out.println(res);
        }
    }
    
}
