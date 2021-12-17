/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04003;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class PhanSo{
    private long numerator;
    private long denominator;
    public PhanSo(){
        
    }
    public PhanSo(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.numerator = sc.nextLong();
        this.denominator = sc.nextLong();
    }
    public void rutGon(){
        long gcd = GCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    public long GCD(long x, long y){
        long tmp;
        while(y != 0){
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
    @Override
    public String toString(){
        return  String.format("" + numerator + '/' + denominator);
    }
}
