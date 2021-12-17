/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04004;

/**
 *
 * @author ADMIN
 */
public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    private long GCD(long a, long b){
        if(b == 0)  return a;
        return GCD(b, a%b);
    }
    public Fraction sum(Fraction other){
        long tmp1 = numerator * other.denominator + other.numerator * denominator;
        long tmp2 = denominator * other.denominator;
        long gcd = GCD(tmp1, tmp2);
        return new Fraction(tmp1/gcd, tmp2/gcd);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    
}
