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
public class Matrix {
    private long a[][];
    private int width;
    private int MOD = 1000000007;
    public Matrix(int width) {
        this.width = width;
        this.a = new long[width][width];
    }
    public void init(Scanner sc){
        for(int i=0; i<width; i++){
            for(int j=0; j<width; j++){
                a[i][j] = sc.nextLong();
            }
        }
    }
    public void print(){
        for(int i=0; i<width; i++){
            for(int j=0; j<width; j++){
                System.out.println(a[i][j]);
            }
        }
    }
    public Matrix mul(Matrix x, Matrix y){
        Matrix z = new Matrix(x.width);
        for(int i=0; i<x.width; i++){
            for(int j=0; j<y.width; j++){
                for(int k=0; k<y.width; k++){
                    z.a[i][j] += x.a[i][k] * y.a[k][j];
                    z.a[i][j] %= MOD;
                }
            }
        }
        return z;
    }
    public Matrix power(Matrix x, int n){
        if(n == 0)  return x;
        if(n == 1)  return x;
        Matrix tmp = power(x, (int)n/2);
        tmp = mul(tmp, tmp);
        if(n%2 == 0)   return tmp;
        return mul(x, tmp);
    }
    public long sumOfLastCol(){
        long res = 0;
        for(int i=0; i<width; i++){
            res += a[i][width-1];
            res %= MOD;
        }
        return res;
    }
}
