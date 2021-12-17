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
public final class Matrix {
    private Matrix(){
        
    }
    public static FiboMatrix mul(FiboMatrix x, FiboMatrix y){
        FiboMatrix z = new FiboMatrix();
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++){
                    z.a[i][j] += x.a[i][k] * y.a[k][j];
                }
            }
        }
        return z;
    }
    public static FiboMatrix power(FiboMatrix x, int n){
        if(n == 0)  return x;
        if(n == 1)  return x;
        FiboMatrix tmp = power(x, (int)n/2);
        tmp = mul(tmp, tmp);
        if(n%2 == 0)   return tmp;
        return mul(x, tmp);
    }
}
