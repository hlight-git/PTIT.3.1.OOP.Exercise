/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04006;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(student);
    }
    
}
