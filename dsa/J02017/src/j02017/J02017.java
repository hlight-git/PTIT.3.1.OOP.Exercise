/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02017;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class J02017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Byte> s = new Stack <Byte>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            byte inp = sc.nextByte();
            if(s.empty()|| (s.peek() + inp) % 2 != 0){
                s.push(inp);
            }
            else{
                s.pop();
            }
        }
        System.out.println(s.size());
    }
    
}
