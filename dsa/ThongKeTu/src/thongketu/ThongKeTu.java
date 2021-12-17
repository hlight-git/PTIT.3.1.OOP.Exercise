/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongketu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ThongKeTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
    
}
