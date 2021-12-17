/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t213;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = sc.nextLine();
            Stack <Character> s = new Stack<>();
            for(char ele:line.toCharArray()){
                if(ele == ')' && !s.empty() && s.peek() == '('){
                    s.pop();
                }
                else{
                    s.push(ele);
                }
            }
            int cnt = 0;
            for(char ele:s){
                if(ele == '(')
                    break;
                cnt++;
            }
            System.out.println((cnt%2 == 0)?s.size()/2:s.size()/2+1);
        }
    }
    
}
