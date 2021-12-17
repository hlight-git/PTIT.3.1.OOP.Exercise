/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02004;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J02004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int len = s.length();
            String head = s.substring(0, len/2);
            String tail;
            if(len%2 == 0)
                tail = s.substring(len/2);
            else
                tail = s.substring(len/2+1);
            String reverse = new StringBuilder(tail).reverse().toString();
            if(head.equalsIgnoreCase(reverse))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
