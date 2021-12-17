/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t217;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = new StringBuilder(sc.nextLine()).reverse().toString();
            Stack <Integer> s = new Stack<>();
            for(char ele:line.toCharArray()){
                if(ele == '*'){
                    s.push(s.pop() * s.pop());
                }
                else if(ele == '/'){
                    s.push(s.pop() / s.pop());
                }
                else if(ele == '+'){
                    s.push(s.pop() + s.pop());
                }
                else if(ele == '-'){
                    s.push(s.pop() - s.pop());
                }
                else{
                    s.push(ele - '0');
                }
            }
            System.out.println(s.pop());
        }
    }
    
}
