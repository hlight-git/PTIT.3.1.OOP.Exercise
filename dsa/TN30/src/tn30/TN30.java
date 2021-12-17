/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn30;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TN30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0){
            String line = sc.nextLine();
            int countLeft = 0, countRight = 0;
            int swap = 0 , imbalance = 0;
            for(int i =0; i< line.length(); i++){
                if(line.charAt(i) == '['){
                    countLeft++;
                    if(imbalance > 0){
                        swap += imbalance;
                        imbalance--;    
                    }
                } 
                else{
                    countRight++;
                    imbalance = (countRight-countLeft);
                }
            }
            System.out.println(swap);
        }
    }
    
}
