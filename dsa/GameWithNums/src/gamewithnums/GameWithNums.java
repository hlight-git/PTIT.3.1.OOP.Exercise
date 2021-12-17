/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamewithnums;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GameWithNums {

    static int n;
    static void gen(boolean[] seen, String res){
        for(int i=1; i<=n; i++){
            if(!seen[i]){
                if(res.isEmpty() || Math.abs(res.charAt(res.length()-1) - '0' - i) != 1){
                    if(res.length()+1 == n)
                        System.out.println(res + i);
                    else{
                        seen[i] = true;
                        gen(seen, res + i);
                        seen[i] = false;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            n = sc.nextInt();
            boolean[] seen = new boolean[n+1];
            gen(seen, "");
        }
    }
    
}
