/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01006;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class J01006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiboMatrix a = new FiboMatrix();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            FiboMatrix m = new FiboMatrix();
            m.matrixCreate();
            m = Matrix.power(m, n-1);
            System.out.println(m.a[1][1]);
        }
    }
    
}
