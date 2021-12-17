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

public class FiboMatrix {
    public long[][] a = new long[2][2];
    FiboMatrix(){
        
    }
    public void matrixCreate(){
        a[0][0] = 0;
        a[0][1] = 1;
        a[1][0] = 1;
        a[1][1] = 1;
    }
}
