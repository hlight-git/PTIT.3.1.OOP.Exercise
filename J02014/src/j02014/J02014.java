/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02014;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            int sum[] = new int[n+1];
            for(int i=1; i<=n; i++){
                arr[i] = sc.nextInt();
                sum[i] = sum[i-1] + arr[i];
            }
            int ans = -1;
            for(int i=1; i<=n; i++){
                if(2*sum[i-1] == sum[n] - arr[i]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    
}
