/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodaungoacthua;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class BoDauNgoacThua {

    static String del(String line){
        Stack <Character> s = new Stack<>();
        Stack <Integer> index = new Stack<>();
        boolean del[] = new boolean[300];
        String str = "";
        String res = "";
        for(char ele:line.toCharArray()){
            if(ele != ' '){
                str += ele;
            }
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ')'){
                boolean flag = false;
                while(s.peek() != '('){
                    char top = s.pop();
                    if(top == '+' || top == '-'){
                        flag = true;
                    }
                    index.pop();
                }
                if(!flag){
                    del[index.peek()] = true;
                    del[i] = true;
                }
                s.pop();
                index.pop();
            }
            else{
                s.push(str.charAt(i));
                index.push(i);
            }
        }
        for(int i=0; i<str.length(); i++){
            if(!del[i]){
                res += str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            Stack <Character> s = new Stack<>();
            Stack <Integer> index = new Stack<>();
            boolean del[] = new boolean[300];
            String str = del(sc.nextLine());
            for(int i=str.length()-1; i>=0; i--){
                if(str.charAt(i) == '('){
                    boolean flag = false;
                    while(s.peek() != ')'){
                        char top = s.pop();
                        if(top == '+' || top == '-'){
                            flag = true;
                        }
                        index.pop();
                    }
                    if(!flag){
                        del[index.peek()] = true;
                        del[i] = true;
                    }
                    s.pop();
                    index.pop();
                }
                else{
                    s.push(str.charAt(i));
                    index.push(i);
                }
            }
            for(int i=0; i<str.length(); i++){
                if(!del[i]){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
    
}
