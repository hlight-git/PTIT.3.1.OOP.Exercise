/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01003;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }
        else{
            float c = -(float)b/a;
            System.out.printf("%.2f", c);
        }
    }
    
}
