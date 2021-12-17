/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04002;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04002 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange rtg = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(rtg.getWidth() <= 0 || rtg.getHeight() <= 0){
            System.out.println("INVALID");
        }
        else{
            System.out.println((int) rtg.findPerimeter() + " " + (int) rtg.findArea() + " " + rtg.getColor());
        }
    }
    
}
