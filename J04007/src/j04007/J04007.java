/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04007;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(employee);
    }
    
}
