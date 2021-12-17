/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01022;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01022 {

    /**
     * @param args the command line arguments
     */
    public static long fibo[] = new long[93];
    public static void fiboGenerate(){
        fibo[1] = 1;
        fibo[2] = 1;
        for(byte i=2; i<93; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
    }
    public static char aCharOfFiboString(byte fbth, long index){
        if(fbth == 1)   return '0';
        if(fbth == 2)   return '1';
        if(index > fibo[fbth-2])    return aCharOfFiboString((byte) (fbth - 1), (index - fibo[fbth-2]));
        return aCharOfFiboString((byte) (fbth - 2), index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fiboGenerate();
        short test = sc.nextShort();
        while(test-- >0){
            System.out.println(aCharOfFiboString(sc.nextByte(), sc.nextLong()));
        }
    }
    
}
