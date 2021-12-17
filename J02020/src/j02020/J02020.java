/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02020;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02020 {

    /**
     * @param args the command line arguments
     */
    public static byte pos[] = new byte[10];
    public static void Display(byte k){
        for(byte i=0; i<k; i++){
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }
    public static boolean GenNext(byte n, byte k){
        byte i = (byte) (k-1);
        while(i >= 0 && pos[i] == n-k+i+1){
            --i;
        }
        if(i == -1){
            return false;
        }
        ++pos[i];
        for(byte j=1; i+j<k; j++){
            pos[i+j] = (byte) (pos[i] + j);
        }
        return true;
    }
    public static void CombGenerator(byte n, byte k){
        for(byte i=0; i<k; i++){
            pos[i] = (byte) (i+1);
        }
        short cnt = 1;
        Display(k);
        while(GenNext(n, k)){
            Display(k);
            ++cnt;
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CombGenerator(sc.nextByte(), sc.nextByte());
    }
    
}
