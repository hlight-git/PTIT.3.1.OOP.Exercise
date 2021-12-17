/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01005;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         byte test = sc.nextByte();
         while(test-- >0){
             Triangle obj = new Triangle(1, sc.nextShort(), sc.nextInt());
             for(int i=1; i<obj.getNumOfPart(); i++){
                 System.out.printf("%.6f ", obj.getHeight(i));
             }
             System.out.println();
         }
    }
    
}
