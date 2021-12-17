/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02007;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J02007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int cnt[] = new int[100005];
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                ++cnt[arr[i]];
            }
            System.out.println("Test " + t + ":");
            for(int i=0; i<n; i++){
                if(cnt[arr[i]] > 0){
                    System.out.println(arr[i] + " xuat hien " + cnt[arr[i]] + " lan");
                    cnt[arr[i]] = 0;
                }
            }
        }
    }
    
}
