/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05003;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = Byte.parseByte(sc.nextLine());
        for(byte i=1; i<=n; i++){
            Student student = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            System.out.println(student);
        }
    }
}