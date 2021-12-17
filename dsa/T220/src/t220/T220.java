/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t220;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class T220 {

    /**
     * @param args the command line arguments
     */
    static void print(Stack s){
        while(!s.empty()){
            System.out.print(s.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = sc.nextLine();
            Stack <Integer> s = new Stack<>();
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i) == 'D'){
                    s.push(i+1);
                }
                else{
                    System.out.print(i+1);
                    print(s);
                }
            }
            System.out.print(line.length()+1);
            print(s);
            System.out.println();
        }
    }
    
}
