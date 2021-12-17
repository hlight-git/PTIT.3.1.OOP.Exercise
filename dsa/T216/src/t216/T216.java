/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t216;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = sc.nextLine();
            Stack <Integer> s = new Stack<>();
            for(char ele:line.toCharArray()){
                if(ele == '*'){
                    int tmp = s.pop();
                    s.push(s.pop() * tmp);
                }
                else if(ele == '/'){
                    int tmp = s.pop();
                    s.push(s.pop() / tmp);
                }
                else if(ele == '+'){
                    int tmp = s.pop();
                    s.push(s.pop() + tmp);
                }
                else if(ele == '-'){
                    int tmp = s.pop();
                    s.push(s.pop() - tmp);
                }
                else{
                    s.push(ele - '0');
                }
            }
            System.out.println(s.pop());
        }
    }
    
}
