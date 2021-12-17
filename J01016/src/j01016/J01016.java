/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01016;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01016 {

    /**
     * @param args the command line arguments
     */
    public static byte numOf4and7(String num){
        byte res = 0;
        for(char ele:num.toCharArray())
            if(ele == '4' || ele == '7')
                ++res;
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(numOf4and7(num) == 4 || numOf4and7(num) == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
