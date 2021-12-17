/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luythuamatran;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LuyThuaMaTran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Matrix m = new Matrix(n);
            m.init(sc);
            System.out.println(m.power(m, k).sumOfLastCol());
        }
    }
    
}
