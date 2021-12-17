/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02103;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            Matrix m = new Matrix();
            m.init(sc.nextInt(), sc.nextInt(), sc);
            m = m.mul(m.transpose());
            System.out.println("Test " + t + ":");
            for(int i=0; i<m.getRow(); i++){
                for(int j=0; j<m.getCol(); j++){
                    System.out.print(m.getMatrix().get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
    
}
